package com.example.ArquitecturaTaxi.Controller;

import com.example.ArquitecturaTaxi.Model.CodigoQR;
import com.example.ArquitecturaTaxi.Service.ServiceQR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qr")
public class ControllerQR {

    @Autowired
    private ServiceQR serviceQR;

    @PostMapping
    public CodigoQR GuardarCliente(@RequestBody CodigoQR qr){
        return serviceQR.Guardar_QR(qr);
    }
}
