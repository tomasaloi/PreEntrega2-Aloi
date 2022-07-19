package com.entregados.aloi.controller;

import com.entregados.aloi.model.Venta;
import com.entregados.aloi.service2.cliente.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    VentaService ventaService;


    @GetMapping("/listar")
    public List<Venta> traerVentas(){
        return ventaService.traerVentas();
    }

    @PostMapping("/insertar")
    public Venta insertar(@RequestBody Venta venta) { //permite leer como clase; si no, no reconoce
        return ventaService.insertar(venta);
    }

    @PutMapping("/actualizar")
    public Venta actualizar(@RequestBody Venta venta) {
        return ventaService.actualizar(venta);
    }
}
