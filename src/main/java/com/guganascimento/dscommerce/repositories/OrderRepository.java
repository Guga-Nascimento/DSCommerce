package com.guganascimento.dscommerce.repositories;

import com.guganascimento.dscommerce.entities.Order;
import com.guganascimento.dscommerce.entities.User;
import com.guganascimento.dscommerce.projections.UserDetailsProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
