package com.entregados.aloi.service2.cliente;

import com.entregados.aloi.dao.ClienteDAO;
import com.entregados.aloi.model.Cliente;
import com.entregados.aloi.service2.cliente.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDAO clienteDAO;

    @Override
    public List<Cliente> traerClientes() {
        return clienteDAO.findAll();
    }

    @Override
    public Cliente insertar(Cliente cliente) {
        if (clienteDAO.existsById(cliente.getDni())){
            return null; }
        else {
            return clienteDAO.save(cliente);}
    }

    @Override
    public Cliente actualizar(Cliente cliente) {
        return clienteDAO.save(cliente);
    }

    @Override
    public void eliminarPorId(Integer dni) {
        clienteDAO.deleteById(dni);
    }

    @Override
    public void eliminar(Cliente cliente) {
        clienteDAO.delete(cliente);
    }


}