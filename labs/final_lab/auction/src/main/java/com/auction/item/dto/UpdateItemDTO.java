package com.auction.item.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class UpdateItemDTO {

  private String name;

  private String description;

  private Double startingBid;

  private Double buyNowPrice;

  private UUID categoryId;
}
