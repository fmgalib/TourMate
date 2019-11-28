package com.htdeveloper.tourmate;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class TripsFragment extends Fragment {

    private List<Trips> tripsList;
    private RecyclerView recyclerView;
    private TripsAdapter adapter;




    public TripsFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_trips, container, false);




        recyclerView = view.findViewById(R.id.tripsRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        tripsList = new ArrayList<>();
        adapter = new TripsAdapter(tripsList,getContext());
        recyclerView.setAdapter(adapter);

        tripsList.add(new Trips("Sajek Tour","View changing tour of my life"));
        tripsList.add(new Trips("Sajek Tour","View changing tour of my life"));
        tripsList.add(new Trips("Sajek Tour","View changing tour of my life"));
        tripsList.add(new Trips("Sajek Tour","View changing tour of my life"));
        tripsList.add(new Trips("Sajek Tour","View changing tour of my life"));
        tripsList.add(new Trips("Sajek Tour","View changing tour of my life"));
        tripsList.add(new Trips("Sajek Tour","View changing tour of my life"));
        tripsList.add(new Trips("Sajek Tour","View changing tour of my life"));
        tripsList.add(new Trips("Sajek Tour","View changing tour of my life"));
        tripsList.add(new Trips("Sajek Tour","View changing tour of my life"));
        tripsList.add(new Trips("Sajek Tour","View changing tour of my life"));
        adapter.notifyDataSetChanged();

       return view;

    }


}
