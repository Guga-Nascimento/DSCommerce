package com.guganascimento.dscommerce.DTO;

import com.guganascimento.dscommerce.entities.OrderItem;

public class OrdemItemDTO {

    private Long productId;
    private String name;
    private Double price;
    private Integer quantity;

    public OrdemItemDTO(Long productId, String name, Double price, Integer quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public OrdemItemDTO(OrderItem entity) {
        productId = entity.getProduct().getId();
        name = entity.getProduct().getName();
        price = entity.getPrice();
        quantity = entity.getQuantity();
    }

    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }
    public Double getSubTotal(){
        return price * quantity;
    }
}
