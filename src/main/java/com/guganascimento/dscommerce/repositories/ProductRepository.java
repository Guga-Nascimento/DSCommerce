package com.guganascimento.dscommerce.repositories;

import com.guganascimento.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
