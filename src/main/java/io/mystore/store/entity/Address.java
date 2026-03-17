package io.mystore.store.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "address")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Address {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
       private Long id;
       private Long orderId;
       private String address;
       private String city;
       private String postalCode;
       private String country;
       private Double price;
}
