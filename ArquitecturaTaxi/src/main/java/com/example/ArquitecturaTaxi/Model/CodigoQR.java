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
@Table(name="CodigoQR")
public class CodigoQR {
    @Id
    @Column(unique = true, name = "id")
    private int id;
    @Column(name = "id_TX")
    private int id_TX;
    @Column(name = "url")
    private String url;
}
