package com.example.rous.maestrodetalle3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rous.maestrodetalle3.Modelo.Album;

import java.util.ArrayList;


/**
 * Created by rous on 11/11/16.
 */

public class AlbumAdapter extends ArrayAdapter<Album> {
    private ArrayList<Album> Album;
    private LayoutInflater layoutInflater;


    public AlbumAdapter(Context context, ArrayList lista) {
        super(context, 0, lista);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (null == convertView) {
            convertView = inflater.inflate(R.layout.item_list_album, parent, false);
        }

        ImageView imgAlbun = (ImageView) convertView.findViewById(R.id.iv_album);
        TextView tvTitulo = (TextView) convertView.findViewById(R.id.tv_titulo);
        TextView tvArtista= (TextView) convertView.findViewById(R.id.tv_artista);
        TextView tvFecha = (TextView) convertView.findViewById(R.id.tv_fecha);
        TextView tvGenero= (TextView) convertView.findViewById(R.id.tv_genero);
        TextView tvPista = (TextView) convertView.findViewById(R.id.tv_pista);

        Album album = getItem(position);

        imgAlbun.setImageResource(album.getImgAlbun());
        tvTitulo.setText(album.getTitulo());
        tvArtista.setText(album.getArtista());
        tvFecha.setText(album.getFecha());
        tvGenero.setText(album.getGenero());
        tvPista.setText("Numero de Pistas: "+album.getNumeroPistas());
        return convertView;
    }
}
