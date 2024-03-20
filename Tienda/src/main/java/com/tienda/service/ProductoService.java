package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

public interface ProductoService {

    // Se obtiene un listado de categorias en un List
    public List<Producto> getProducto(boolean activos);

    // Se obtiene un Categoria, a partir del id de un categoria
    public Producto getProducto(Producto producto);

    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Producto producto);

    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Producto producto);

    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);


    //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
    public List<Producto> metodoNativo(double precioInf, double precioSup);
    }

