package com.example.webservicespring;

import com.example.webservicespring.controllers.ClienteController;
import com.example.webservicespring.entities.ClienteEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class WebServiceSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebServiceSpringApplication.class, args);
    }

}
/*
  index.html

        *<form method="post" action="http://localhost:8080/productos/guardar">
    <input type="text" placeholder="codigo_producto" name="codigo_producto" /><br /><br />
    <input type="text" placeholder="categoria" name="categoria" /><br /><br />
    <input type="text" placeholder="nombre" name="nombre" /><br /><br />
    <input type="text" placeholder="descripcion" name="descripcion" /><br /><br />
    <input type="text" placeholder="precio_unitario" name="precio_unitario" /><br /><br />
    <input type="text" placeholder="stock" name="stock" /><br /><br />
    <br /><br /><br />
    <button type="submit">Guardar</button>
</form>
*/
