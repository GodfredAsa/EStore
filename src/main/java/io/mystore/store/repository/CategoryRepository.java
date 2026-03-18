package io.mystore.store.repository;

import io.mystore.store.entity.Address;
import io.mystore.store.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<String, Category> {
}
