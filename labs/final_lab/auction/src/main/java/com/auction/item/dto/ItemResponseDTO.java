package com.auction.item.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data
public class ItemResponseDTO {

  private UUID id;

  private LocalDateTime createdAt;

  private LocalDateTime updatedAt;

  private LocalDateTime deletedAt;

  private String name;

  private String description;

  private Double startingBid;

  private Double buyNowPrice;

  private List<Object> images;
}
