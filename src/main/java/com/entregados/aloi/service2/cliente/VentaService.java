package com.entregados.aloi.service2.cliente;

import com.entregados.aloi.model.Cliente;
import com.entregados.aloi.model.Venta;

import java.util.List;

public interface VentaService {

    List<Venta> traerVentas();
    Venta insertar(Venta venta);
    Venta actualizar(Venta venta);

}
