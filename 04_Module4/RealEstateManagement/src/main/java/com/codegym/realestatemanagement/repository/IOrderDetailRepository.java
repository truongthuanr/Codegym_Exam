package com.codegym.realestatemanagement.repository;

import com.codegym.realestatemanagement.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderDetailRepository extends JpaRepository<OrderDetail, Long>{
}
