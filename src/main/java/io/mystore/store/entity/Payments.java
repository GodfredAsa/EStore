package io.mystore.store.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "payments")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Payments {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
       private Long id;

}
