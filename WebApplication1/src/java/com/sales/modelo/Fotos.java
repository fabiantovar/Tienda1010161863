/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sales.modelo;

/**
 *
 * @author fatom
 */
public class Fotos {
    private int id;
    private String nombre;
    private String descripcion;
    private String foto;
    private String productoscb;

    public Fotos() {
    }

    public Fotos(int id, String nombre, String descripcion, String foto, String productoscb) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
        this.productoscb = productoscb;
    }

    public Fotos(int i, String ciudad, String imagenes, String rutas, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getProductoscb() {
        return productoscb;
    }

    public void setProductoscb(String productoscb) {
        this.productoscb = productoscb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Fotos{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", foto=" + foto + ", productoscb=" + productoscb + '}';
    }

    
    
}
