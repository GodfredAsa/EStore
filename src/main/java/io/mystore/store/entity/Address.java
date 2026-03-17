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
    @Id private String id;
    private String userId;
    private String address;
    private String city;
    private String postalCode;
    private String country;
}
