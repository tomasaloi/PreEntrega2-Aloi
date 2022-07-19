package com.entregados.aloi.dao;

import com.entregados.aloi.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDAO extends JpaRepository<Producto, Integer> {
}
