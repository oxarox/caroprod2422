package cl.inacap.carroprod2422.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.List;

import cl.inacap.carroprod2422.R;
import cl.inacap.carroprod2422.dto.Producto;

public class ProductosListAdapter extends ArrayAdapter<Producto> {
    private List<Producto> productos;
    private Activity activity;

    public ProductosListAdapter(@NonNull Activity context, int resource, @NonNull List<Producto> objects) {
        super(context, resource, objects);
        this.productos = objects;
        this.activity = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.activity.getLayoutInflater();
        View fila = inflater.inflate(R.layout.productos_list, null, true);
        //Aquí cargar el contenido del layou:
        TextView nombreTv = fila.findViewById(R.id.nombre_prod_pl);
        ImageView imagenProducto = fila.findViewById(R.id.image_prod_pl);
        Producto actual = productos.get(position);
        nombreTv.setText(actual.getNombre());
        Picasso.get().load(actual.getFoto())
                .resize(300,300)
                .centerCrop()
                .into(imagenProducto);
        return fila;
    }
}
