/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.venta.venta.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Carlin-Parraga
 */

@Entity
@Table(name = "factura")
public class Factura {@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "emisor",nullable = false)
    private String emisor;
    @Column(name = "descripcion",nullable = false)
    private String descripcion;
    private Date fecha;
    private String valor;

    // @ManyToOne(fetch = FetchType.EAGER, optional = false)
    // @JoinColumn(name = "direccion_id")
    // private Direccion direccion;
public Factura() {
    }

    public Factura(long id, String emisor, String descripcion, Date fecha, String valor) {
        this.id = id;
        this.emisor = emisor;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.valor = valor;
    }
    public long getId() {
        return id;
    }

    public String getEmisor() {
        return emisor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getValor() {
        return valor;
    }
    

    public void setId(long id) {
        this.id = id;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    
    
    
}
