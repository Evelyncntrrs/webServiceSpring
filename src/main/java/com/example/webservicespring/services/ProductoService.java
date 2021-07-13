package com.example.webservicespring.services;
import com.example.webservicespring.entities.ProductoEntity;
import com.example.webservicespring.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }
    public List<ProductoEntity> getProductos()  {
        return productoRepository.findAll();}

    public ProductoEntity buscarProducto(Integer id_producto) {
        return productoRepository.findById(id_producto).orElse(null);}


    public List<ProductoEntity> findProductosByNombreContaining(String nombre) {
       return productoRepository.findProductoByNombreContaining(nombre);
    }

    public List<ProductoEntity> findProductosByCategoria(String categoria) {
        return productoRepository.findProductoByCategoria(categoria);
    }

    /*public void guardarProducto(ProductoEntity producto) {
    return productoRepository.guardarProducto(producto);
    }*/
}
