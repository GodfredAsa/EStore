package io.mystore.store.entity;

import io.mystore.store.enumeration.PaymentType;
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
public class Payment {
    @Id private String id;
    private String paidBy;
    private Double paymentAmount;
    private PaymentType paymentType;
    private String paymentDate;
    private String orderCode;
}
