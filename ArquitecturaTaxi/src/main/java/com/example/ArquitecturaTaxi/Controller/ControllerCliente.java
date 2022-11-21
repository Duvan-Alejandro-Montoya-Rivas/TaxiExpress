package com.example.ArquitecturaTaxi.Controller;

import com.example.ArquitecturaTaxi.Model.Cliente;
import com.example.ArquitecturaTaxi.Model.CodigoQR;
import com.example.ArquitecturaTaxi.Service.ServiceCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/cliente")
public class ControllerCliente {
    @Autowired
    private ServiceCliente serviciocliente;

    @GetMapping
    public List<Cliente> ObtenerClientes(){
        return serviciocliente.obtenerClientes();
    }

    @PostMapping
    public Cliente GuardarCliente(@RequestBody Cliente cliente){
         return serviciocliente.Guardar_Cliente(cliente);
    }
    @DeleteMapping(path = "/borrar")
    public String EliminarCliente(@PathVariable("Cedula")Long cedula){
        boolean ok = this.serviciocliente.eliminarCliente(cedula);
        if(ok){
            return "elimindado"+cedula;
        }else{
            return "no eliminado usuario "+cedula;
        }
    }
}
