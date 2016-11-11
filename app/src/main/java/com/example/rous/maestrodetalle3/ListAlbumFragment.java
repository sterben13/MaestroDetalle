package com.example.rous.maestrodetalle3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.rous.maestrodetalle3.Modelo.MockAlbum;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ListAlbumFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ListAlbumFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListAlbumFragment extends Fragment {
    ListView listAlbum;
    AlbumAdapter albumAdapter;
    boolean disp = true;

    private OnFragmentInteractionListener mListener;

    public ListAlbumFragment() {
        // Required empty public constructor
    }

    public static ListAlbumFragment newInstance() {
        ListAlbumFragment fragment = new ListAlbumFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_list_album, container, false);
        listAlbum = (ListView) root.findViewById(R.id.album_list);
        MockAlbum mockAlbum= new MockAlbum();

        albumAdapter = new AlbumAdapter(getActivity(), mockAlbum.getAlbunes());

        listAlbum.setAdapter(albumAdapter);
        listAlbum.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(disp){
                    Intent intent = new Intent(view.getContext(),AlbumDetalle.class);
                    intent.putExtra(DetalleAlbumFragment.ARG_ITEM_ID,""+position);
                    startActivity(intent);
                }else{
                    onListItemClick((ListView) view.findViewById(R.id.list_pista),view,position,id);
                }
            }
        });
        return root;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(int position) {
        if (mListener != null) {
            mListener.onFragmentInteraction(position);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        public void onFragmentInteraction(int position);
    }

    public void onListItemClick(ListView l, View v, int position, long id) {
        mListener.onFragmentInteraction(position);
    }

    public boolean isDisp() {
        return disp;
    }

    public void setDisp(boolean disp) {
        this.disp = disp;
    }
}
