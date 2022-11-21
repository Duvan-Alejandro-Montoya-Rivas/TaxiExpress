package com.example.ArquitecturaTaxi.Service;

import com.example.ArquitecturaTaxi.Model.Cliente;
import com.example.ArquitecturaTaxi.Model.CodigoQR;
import com.example.ArquitecturaTaxi.Repository.RepositoryCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceCliente {
    @Autowired
    private RepositoryCliente repositorioCliente;
    public List<Cliente> obtenerClientes(){
        return repositorioCliente.findAll();
    }
    public Cliente Guardar_Cliente(Cliente cliente){
         return repositorioCliente.save(cliente);
    }
    public boolean eliminarCliente(Long id) {
        try {
            repositorioCliente.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

