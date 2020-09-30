package cl.inacap.carroprod2422.dto;

import java.io.Serializable;

public class Producto implements Serializable {
    private String nombre;
    private String foto;
    private String descripcion;
    private int precio;

    public String getNombre() {
        return nombre;
    }

    public String getFoto() {
        return foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
