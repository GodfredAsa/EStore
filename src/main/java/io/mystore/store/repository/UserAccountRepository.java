package io.mystore.store.repository;

import io.mystore.store.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends JpaRepository<String, UserAccount> {
}
