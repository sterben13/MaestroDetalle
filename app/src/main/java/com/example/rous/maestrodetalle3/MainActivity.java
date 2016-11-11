package com.example.rous.maestrodetalle3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ListAlbumFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (findViewById(R.id.detalle_comp) == null) {
            ListAlbumFragment listAlbumFragment = (ListAlbumFragment) getSupportFragmentManager().findFragmentById(R.id.list_album);
            if (listAlbumFragment == null) {
                listAlbumFragment = listAlbumFragment.newInstance();
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.list_album, listAlbumFragment)
                        .commit();
            }
            listAlbumFragment.setDisp(true);
        } else {
            ListAlbumFragment listAlbumFragment = (ListAlbumFragment) getSupportFragmentManager().findFragmentById(R.id.list_album);
            if (listAlbumFragment == null) {
                listAlbumFragment = listAlbumFragment.newInstance();
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.list_album, listAlbumFragment)
                        .commit();
            }
            listAlbumFragment.setDisp(false);
        }

    }

    @Override
    public void onFragmentInteraction(int position) {
        Bundle arguments = new Bundle();
        arguments.putString(DetalleAlbumFragment.ARG_ITEM_ID, ""+position);
        DetalleAlbumFragment fragment = new DetalleAlbumFragment();
        fragment.setArguments(arguments);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.detalle_comp, fragment)
                .commit();
    }
}