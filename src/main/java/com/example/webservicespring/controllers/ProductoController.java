package com.example.webservicespring.controllers;

import com.example.webservicespring.entities.ProductoEntity;
import com.example.webservicespring.services.ProductoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {
    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }
    @GetMapping("productos")
    public List<ProductoEntity> getProductos()  {
        return productoService.getProductos();}

    @GetMapping("productos/ver-producto-{id_producto}")
    public ProductoEntity buscarProducto(Integer id_producto) {
        return productoService.buscarProducto(id_producto);}

   @GetMapping("productos/nombre/{nombre}")
    public List<ProductoEntity> findProductosByNombreContaining(@PathVariable String nombre)    {
        return productoService.findProductosByNombreContaining(nombre);
    }
    @GetMapping("producto/categoria/{categoria}")
    public List<ProductoEntity> findProductosByCategoria(@PathVariable String categoria) {
        return productoService.findProductosByCategoria(categoria);
    }
   /* @PostMapping("productos/guardar")
    public void guardarProductos(@RequestBody ProductoEntity producto){
        ProductoEntity productoNuevo = new ProductoEntity();
        BeanUtils.copyProperties(producto,productoNuevo);
        productoService.guardarProducto(producto);
    }*/



}
