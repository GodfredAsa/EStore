package io.mystore.store.repository;

import io.mystore.store.entity.Address;
import io.mystore.store.entity.OTP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtpRepository extends JpaRepository<String, OTP> {
}
