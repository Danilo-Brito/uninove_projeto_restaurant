package projeto.app.restaurantapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class dessertMnu extends Fragment {

    View v;
    private RecyclerView myrecyclerview3;
    private List<Dessert> lstDessert;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public dessertMnu() {}


    public static dessertMnu newInstance(String param1, String param2) {
        dessertMnu fragment = new dessertMnu();
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

        lstDessert = new ArrayList<>();
        lstDessert.add(new Dessert("Açai",
                "Açai com frutas.","15.00",R.drawable.acai));
        lstDessert.add(new Dessert("Panqueca",
                "Panqueca doce com frutas vermelhas.","25.00",R.drawable.panqueca));
        lstDessert.add(new Dessert("Bolo",
                "Bolo de chocolate.","30.00",R.drawable.bolo));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_dessert_mnu, container, false);
        myrecyclerview3 = (RecyclerView) v.findViewById(R.id.dessert_recyclerview);
        Dessert_RecyclerViewAdapter recyclerAdapter3 = new Dessert_RecyclerViewAdapter(getContext(),lstDessert);
        myrecyclerview3.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview3.setAdapter((recyclerAdapter3));
        return v;
    }
}
