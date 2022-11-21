package com.example.ArquitecturaTaxi.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Cliente")
public class Cliente {
    @Column(name = "Nombre")
    private String nombre;
    @Id
    @Column(unique = true, nullable = false)
    private Long cedula;
    @Column(name = "Telefono")
    private String telefono;
    @Column(name = "Direccion")
    private String Direccion;
    @Column(name = "Edad")
    private int edad;
    @Column(name = "correo")
    private String correo;
    @Column(name = "contrasena")
    private String contrasena;


}
