package cl.inacap.carroprod2422.dao;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.carroprod2422.dto.Producto;

public class ProductosDAOLista implements ProductosDAO{
    private List<Producto> productos = new ArrayList<>();
    //Patron Singleton:
    //1. Una instancia como atributo estatico de si misma
    //2. El constructor debe ser privado
    //3. Debe existir un metodo que verifique la existencia de la unica instancia
    //(getInstance)

    private static ProductosDAOLista instancia;

    public static ProductosDAOLista getInstance(){
        if (instancia == null){
            instancia = new ProductosDAOLista();
        }
        return instancia;
    }

    private ProductosDAOLista() {
        Producto p = new Producto();
        p.setNombre("Coca cola Zero");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eget velit est. Praesent accumsan dictum gravida. Fusce orci nunc, tempor a justo nec, vehicula cursus leo");
        p.setPrecio(1000);
        p.setFoto("https://cdn.hsnstore.com/blog/wp-content/uploads/2018/08/cola-zero.jpg");
        productos.add(p);

        p = new Producto();
        p.setNombre("Centella Papu!!");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eget velit est. Praesent accumsan dictum gravida. Fusce orci nunc, tempor a justo nec, vehicula cursus leo");
        p.setPrecio(100);
        p.setFoto("https://www.zancada.com/wp-content/imagenes//imagenescentella.jpg");
        productos.add(p);

        p = new Producto();
        p.setNombre("Monster Ripper");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eget velit est. Praesent accumsan dictum gravida. Fusce orci nunc, tempor a justo nec, vehicula cursus leo");
        p.setPrecio(1500);
        p.setFoto("https://jumbo.vteximg.com.br/arquivos/ids/336737/Principal-3879.jpg?v=637237316714730000");
        productos.add(p);

        p = new Producto();
        p.setNombre("Tuareg");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eget velit est. Praesent accumsan dictum gravida. Fusce orci nunc, tempor a justo nec, vehicula cursus leo");
        p.setPrecio(490);
        p.setFoto("https://www.icbfs.cl/wp-content/uploads/150001747.jpg");
        productos.add(p);
        }

    @Override
    public Producto save(Producto p) {
        productos.add(p);
        return p;
    }

    @Override
    public List<Producto> getAll() {
        return productos;
    }
}
