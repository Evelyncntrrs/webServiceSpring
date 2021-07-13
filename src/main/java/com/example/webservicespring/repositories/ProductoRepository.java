package com.example.webservicespring.repositories;

import com.example.webservicespring.entities.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity,Integer> {
    List<ProductoEntity> findProductoByNombreContaining(String nombre);

    List<ProductoEntity> findProductoByCategoria(String categoria);



}
