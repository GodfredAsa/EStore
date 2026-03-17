package io.mystore.store.entity;


import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "otp")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OTP {
    private String id;
    private String userid;
    private String code;
}
