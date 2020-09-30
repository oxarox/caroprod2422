package cl.inacap.carroprod2422;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.time.Instant;
import java.util.List;

import cl.inacap.carroprod2422.adapters.ProductosListAdapter;
import cl.inacap.carroprod2422.dao.ProductosDAO;
import cl.inacap.carroprod2422.dao.ProductosDAOLista;
import cl.inacap.carroprod2422.dto.Producto;

public class MainActivity extends AppCompatActivity {

    private List<Producto> productos;
    private ProductosDAO prodDAO = ProductosDAOLista.getInstance();
    private ListView productosLV;
    private ProductosListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.productos = this.prodDAO.getAll();
        this.setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        this.productosLV = findViewById(R.id.productos_lv);
        this.adapter = new ProductosListAdapter(this,R.layout.productos_list,this.productos);
        this.productosLV.setAdapter(this.adapter);
        //Agregar un listener a los elementos de la lista
        this.productosLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Producto producto = productos.get(i);
                Intent intent = new Intent(MainActivity.this, ProductoViewActivity.class);
                intent.putExtra("producto", producto);
                startActivity(intent);
            }
        });
    }
}