package io.mystore.store.entity;

import io.mystore.store.enumeration.SaleStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Product {
    @Id private String id;
    private String name;
    private String description;
    private Double cost;
    private Double price;
    private int Stock;
    private String addedBy;
    private String productImage;
    private SaleStatus saleStatus;
//    system calculated
    private Double totalPrice; // price X qty
    private Double totalCost; //cost X qty
}
