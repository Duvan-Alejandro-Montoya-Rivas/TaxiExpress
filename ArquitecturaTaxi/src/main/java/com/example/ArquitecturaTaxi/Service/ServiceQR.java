package com.example.ArquitecturaTaxi.Service;

import com.example.ArquitecturaTaxi.Model.CodigoQR;
import com.example.ArquitecturaTaxi.Repository.RepositoryQR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceQR {

    @Autowired
    private RepositoryQR repositoryQR;
    public CodigoQR Guardar_QR(CodigoQR qr){
        return repositoryQR.save(qr);
    }
}
