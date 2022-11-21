package com.example.ArquitecturaTaxi.Repository;

import com.example.ArquitecturaTaxi.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryCliente extends JpaRepository<Cliente,Long> {

}
