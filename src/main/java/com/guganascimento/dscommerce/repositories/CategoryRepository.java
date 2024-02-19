package com.guganascimento.dscommerce.repositories;

import com.guganascimento.dscommerce.entities.Category;
import com.guganascimento.dscommerce.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CategoryRepository extends JpaRepository<Category,Long> {

}
