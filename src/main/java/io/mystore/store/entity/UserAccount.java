package io.mystore.store.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserAccount {
    @Id private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String addressId;
    private String mobile;
    private String avatar;
    private String pinCode;
}
