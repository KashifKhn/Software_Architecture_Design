package com.auction.item;

import java.util.List;
import java.util.UUID;

import com.auction.item.dto.CreateItemDTO;
import com.auction.item.dto.ItemResponseDTO;
import com.auction.item.dto.UpdateItemDTO;

public interface ItemService {

  ItemResponseDTO createItem(CreateItemDTO createItemDTO);

  List<ItemResponseDTO> getAll();

  ItemResponseDTO getItemById(UUID itemId);

  ItemEntity findItemById(UUID itemId);

  ItemResponseDTO updateItem(UUID itemId, UpdateItemDTO updateItemDTO);

  void deleteItem(UUID itemId);

}
