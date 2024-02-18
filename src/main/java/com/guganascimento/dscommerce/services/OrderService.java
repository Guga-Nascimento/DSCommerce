package com.guganascimento.dscommerce.services;

import com.guganascimento.dscommerce.DTO.OrderDTO;
import com.guganascimento.dscommerce.DTO.ProductDTO;
import com.guganascimento.dscommerce.entities.Order;
import com.guganascimento.dscommerce.entities.Product;
import com.guganascimento.dscommerce.repositories.OrderRepository;
import com.guganascimento.dscommerce.repositories.ProductRepository;
import com.guganascimento.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;
    @Transactional(readOnly = true)
    public OrderDTO findById(Long id){
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        return new OrderDTO(order);
    }
}
