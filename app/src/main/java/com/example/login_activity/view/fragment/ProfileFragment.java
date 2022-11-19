package com.example.login_activity.view.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.login_activity.R;
import com.example.login_activity.adapter.CardViewAdapter;
import com.example.login_activity.model.Image;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        //toolbar
        showToolBar("",false, view);

        //recyclerview
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view_profile);

        //layout manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //el adapter
        CardViewAdapter cardViewAdapter = new CardViewAdapter(buidImages(), R.layout.cardview_image, getActivity());
        recyclerView.setAdapter(cardViewAdapter);

        // Inflate the layout for this fragment
        return  view;
    }
    public void showToolBar(String titulo, boolean botonSubir, View view){
        Toolbar toolbar = view.findViewById(R.id.toolbar_profile);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(titulo);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(botonSubir);
    }

    //creamos la lista de imagenes
    public ArrayList<Image> buidImages(){
        ArrayList<Image> images = new ArrayList<>();

        images.add(new Image("https://articles-img.sftcdn.net/images/f_auto,q_auto/w_1024,h_576,c_scale/v1575195346/fondo_nevado_9_1920x1080_cpyxj1/fondo_nevado_9_1920x1080_cpyxj1-1024x576.jpg", "Carlos Valdivia", " 2 dias", "1 me gusta"));
        images.add(new Image("https://i.pinimg.com/originals/c4/2b/f4/c42bf4dad5161f3ba5082cc379032103.jpg", "Luis Perez", " 3 dias", "5 me gusta"));
        images.add(new Image("https://images.unsplash.com/photo-1506744038136-46273834b3fb?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MXx8fGVufDB8fHx8&w=1000&q=80", "Fernando Torricos", " 6 dias", "4 me gusta"));
        images.add(new Image("https://fondosmil.com/fondo/2292.jpg", "Maria Flores", " 5 dias", "6 me gusta"));
        images.add(new Image("https://mobimg.b-cdn.net/v3/fetch/75/756a5af0df4e9a3b8171f05880b1d461.jpeg", "Rolando Morales", " 3 dias", "5 me gusta"));
        images.add(new Image("https://images.unsplash.com/photo-1506744038136-46273834b3fb?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjB8fGRlc2t0b3AlMjB3YWxscGFwZXJzfGVufDB8fDB8fA%3D%3D&w=1000&q=80", "William Jaimes", " 4 dias", "4 me gusta"));
        images.add(new Image("https://wallpaperaccess.com/full/1371387.jpg", "Roberto Paniagua", " 2 dias", "3 me gusta"));
        images.add(new Image("https://images.unsplash.com/photo-1542273917363-3b1817f69a2d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8OXx8fGVufDB8fHx8&w=1000&q=80", "Lorena Herrera", " 2 dias", "8 me gusta"));
        images.add(new Image("https://i.pinimg.com/736x/4a/c9/85/4ac985dc46691ab9ac18bae28ca057c3.jpg", "Laura Caceres", " 6 dias", "3 me gusta"));
        images.add(new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTf33b5vFv7wPoYrWGG0_hiCIt7TWWJe4gc3Q&usqp=CAU", "Marcelo Rojas", " 9 dias", "1 me gusta"));

        return images;
    }
}