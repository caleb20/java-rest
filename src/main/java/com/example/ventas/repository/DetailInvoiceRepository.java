package com.example.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ventas.entity.DetailInvoiceEntity;

@Repository
public interface DetailInvoiceRepository extends JpaRepository<DetailInvoiceEntity, Long>{

}
