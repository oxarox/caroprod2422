package cl.inacap.carroprod2422.dao;

import java.util.List;

import cl.inacap.carroprod2422.dto.Producto;

public interface ProductosDAO {
    Producto save(Producto p);
    List<Producto> getAll();
}
