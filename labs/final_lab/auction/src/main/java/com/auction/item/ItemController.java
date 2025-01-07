package com.auction.item;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auction.item.dto.CreateItemDTO;
import com.auction.item.dto.ItemResponseDTO;
import com.auction.item.dto.UpdateItemDTO;

@RequestMapping("/api/v1")
@RestController
@Controller
public class ItemController {
  private final ItemService itemService;

  public ItemController(final ItemService itemService) {
    this.itemService = itemService;
  }

  @PostMapping(value = "/items")
  public ResponseEntity<ItemResponseDTO> createItem(@RequestBody CreateItemDTO createItemDTO) {
    ItemResponseDTO responseDTO = this.itemService.createItem(createItemDTO);
    return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
  }

  @GetMapping("/items")
  public ResponseEntity<List<ItemResponseDTO>> getAll() {
    List<ItemResponseDTO> items = itemService.getAll();
    return ResponseEntity.ok(items);
  }

  @GetMapping("/items/{itemId}")
  public ResponseEntity<ItemResponseDTO> getItemById(@PathVariable UUID itemId) {
    ItemResponseDTO item = this.itemService.getItemById(itemId);
    return ResponseEntity.ok(item);
  }

  @PatchMapping(value = "/items/{itemId}")
  public ResponseEntity<ItemResponseDTO> updateItem(
      @PathVariable("itemId") UUID itemId,
      @RequestBody UpdateItemDTO updateItemDTO) {
    ItemResponseDTO item = this.itemService.updateItem(itemId, updateItemDTO);
    return ResponseEntity.ok(item);
  }

  @DeleteMapping("/items/{itemId}")
  public ResponseEntity<String> deleteItem(@PathVariable UUID itemId) {
    this.itemService.deleteItem(itemId);
    return ResponseEntity.ok("Item Deleted Successfully");
  }

}
