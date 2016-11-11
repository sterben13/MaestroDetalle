package com.example.rous.maestrodetalle3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.rous.maestrodetalle3.Modelo.MockAlbum;

import java.util.ArrayList;

public class DetalleAlbumFragment extends Fragment {
    ListView listPistas;
    ArrayAdapter<String> pistasAdapter;
    public ArrayList<String> listas;
    public static final String ARG_ITEM_ID = "item_id";

    public DetalleAlbumFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments().containsKey(ARG_ITEM_ID)){
            MockAlbum mockAlbum= new MockAlbum();
            listas = mockAlbum.getPistas(Integer.parseInt(getArguments().getString(ARG_ITEM_ID)));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_detalle_album, container, false);
        listPistas = (ListView) root.findViewById(R.id.list_pista);

        MockAlbum mockAlbum= new MockAlbum();
        if(listas!=null)
        {
            pistasAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,listas);
            listPistas.setAdapter(pistasAdapter);
        }
        return root;
    }

    public static DetalleAlbumFragment newInstance() {
        DetalleAlbumFragment fragment = new DetalleAlbumFragment();
        return fragment;
    }

}
