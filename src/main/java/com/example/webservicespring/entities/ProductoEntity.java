package com.example.webservicespring.entities;

import javax.persistence.*;

@Entity
@Table(name="producto")
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_producto;
    private Integer codigo_producto;
    private String categoria;
    private String nombre;
    private String descripcion;
    private double precio_unitario;
    private Integer stock;

    public ProductoEntity() {
    }

    public ProductoEntity(Integer id_producto, Integer codigo_producto, String categoria, String nombre, String descripcion, double precio_unitario, Integer stock) {
        this.id_producto = id_producto;
        this.codigo_producto = codigo_producto;
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_unitario = precio_unitario;
        this.stock = stock;
    }

    public ProductoEntity(Integer codigo_producto, String categoria, String nombre, String descripcion, double precio_unitario, Integer stock) {
        this.codigo_producto = codigo_producto;
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_unitario = precio_unitario;
        this.stock = stock;
    }

    public Integer getId_producto() { return id_producto; }

    public void setId_producto(Integer id_producto) { this.id_producto = id_producto; }

    public Integer getCodigo_producto() { return codigo_producto; }

    public void setCodigo_producto(Integer codigo_producto) { this.codigo_producto = codigo_producto; }

    public String getCategoria() { return categoria; }

    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public double getPrecio_unitario() { return precio_unitario; }

    public void setPrecio_unitario(double precio_unitario) { this.precio_unitario = precio_unitario; }

    public Integer getStock() { return stock; }

    public void setStock(Integer stock) { this.stock = stock; }

    @Override
    public String toString() {
        return "ProductoEntity{" +
                "id_producto=" + id_producto +
                ", Codigo_producto=" + codigo_producto +
                ", categoria='" + categoria + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio_unitario=" + precio_unitario +
                ", stock=" + stock +
                '}';
    }
}
