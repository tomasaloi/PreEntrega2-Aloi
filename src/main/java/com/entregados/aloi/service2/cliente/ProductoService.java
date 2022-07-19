package com.entregados.aloi.service2.cliente;

import com.entregados.aloi.model.Cliente;
import com.entregados.aloi.model.Producto;

import java.util.List;

public interface ProductoService {

    List<Producto> traerProductos();
    Producto insertar(Producto producto);
    Producto actualizar(Producto producto);

}