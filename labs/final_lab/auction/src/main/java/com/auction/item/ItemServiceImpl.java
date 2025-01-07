package com.auction.item;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.auction.item.dto.CreateItemDTO;
import com.auction.item.dto.ItemResponseDTO;
import com.auction.item.dto.UpdateItemDTO;
import com.sun.nio.sctp.IllegalReceiveException;

@Service
public class ItemServiceImpl implements ItemService {

  private final ItemRepository itemRepository;

  public ItemServiceImpl(final ItemRepository itemRepository) {
    this.itemRepository = itemRepository;
  }

  @Override
  @Transactional
  public ItemResponseDTO createItem(final CreateItemDTO createItemDTO) {
    final ItemEntity item = new ItemEntity();
    item.setName(createItemDTO.getName());
    item.setDescription(createItemDTO.getDescription());
    item.setBuyNowPrice(createItemDTO.getBuyNowPrice());
    item.setStartingBid(createItemDTO.getStartingBid());
    this.itemRepository.save(item);
    return ItemMapper.toItemResponseDTO(this.findItemById(item.getId()));
  }

  @Override
  public List<ItemResponseDTO> getAll() {
    List<ItemEntity> items = itemRepository.findAll();

    return items.stream()
        .map(ItemMapper::toItemResponseDTO)
        .collect(Collectors.toList());
  }

  @Override
  public ItemResponseDTO getItemById(final UUID itemId) {
    return ItemMapper.toItemResponseDTO(this.findItemById(itemId));
  }

  @Override
  @Transactional
  public ItemResponseDTO updateItem(final UUID itemId, final UpdateItemDTO updateItemDTO) {
    final ItemEntity item = this.findItemById(itemId);
    ItemMapper.updateEntityFromDTO(item, updateItemDTO);
    this.itemRepository.save(item);
    return ItemMapper.toItemResponseDTO(item);
  }

  @Override
  public void deleteItem(final UUID itemId) {
    final ItemEntity item = this.findItemById(itemId);
    item.setDeletedAt(LocalDateTime.now());
    this.itemRepository.save(item);
  }

  @Override
  public ItemEntity findItemById(final UUID itemId) {
    return this.itemRepository.findById(itemId)
        .orElseThrow(() -> new IllegalReceiveException("Item not found for ID: " + itemId));
  }

}
