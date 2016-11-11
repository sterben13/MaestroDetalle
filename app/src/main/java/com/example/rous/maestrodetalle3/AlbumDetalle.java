package com.example.rous.maestrodetalle3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AlbumDetalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_detalle);
        Bundle arguments = new Bundle();
        arguments.putString(DetalleAlbumFragment.ARG_ITEM_ID,
                getIntent().getStringExtra(DetalleAlbumFragment.ARG_ITEM_ID));
        DetalleAlbumFragment detalleAlbumFragment = (DetalleAlbumFragment) getSupportFragmentManager().findFragmentById(R.id.detalle_comp);
        if (detalleAlbumFragment == null) {
            detalleAlbumFragment = detalleAlbumFragment.newInstance();
        }
        detalleAlbumFragment.setArguments(arguments);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.detalle_comp, detalleAlbumFragment)
                .commit();

    }
}
