package net.jakare.appcoles.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.jakare.appcoles.R;
import net.jakare.appcoles.adapter.PictureAdapterRecyclerView;
import net.jakare.appcoles.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class ProfesorTodasFragment extends Fragment {


    public ProfesorTodasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profesor_todas, container, false);
//        showToolbar(getResources().getString(R.string.tab_news), false, view);
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureRecycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        picturesRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buidPictures(), R.layout.cardview_picture, getActivity());
        picturesRecycler.setAdapter(pictureAdapterRecyclerView);


        return view;
    }

    public ArrayList<Picture> buidPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("http://images.freeimages.com/images/previews/c73/caring-teacher-1622554.jpg", "Reunión Padres de familia", "20/09/16", "3 Me Gusta", "Se realizará en oficinas..."));
        pictures.add(new Picture("http://images.freeimages.com/images/previews/a0f/soccer-league-2-1478116.jpg", "Entrenamiento de futbol", "22/09/16", "10 Me Gusta", "En la cancha principal"));
        pictures.add(new Picture("http://images.freeimages.com/images/previews/b92/school-bus-1525654.jpg", "Paro de transporte", "23/09/16", "9 Me Gusta", "Debido al paro de transportes se suspenden las clases"));
        return pictures;
    }

//    public void showToolbar(String tittle, boolean upButton, View view){
//        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
//        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
//        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);
//        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
//
//
//    }

}
