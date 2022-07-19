package com.entregados.aloi.dao;

import com.entregados.aloi.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaDAO extends JpaRepository<Venta, Integer> {
}
