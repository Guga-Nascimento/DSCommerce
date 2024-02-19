package com.guganascimento.dscommerce.repositories;

import com.guganascimento.dscommerce.entities.Order;
import com.guganascimento.dscommerce.entities.OrderItem;
import com.guganascimento.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
