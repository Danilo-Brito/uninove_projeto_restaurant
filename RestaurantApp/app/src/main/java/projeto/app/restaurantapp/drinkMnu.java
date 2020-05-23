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


public class drinkMnu extends Fragment {

    View v;
    private RecyclerView myrecyclerview2;
    private List<Drink> lstDrink;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public drinkMnu() {}

    public static drinkMnu newInstance(String param1, String param2) {
        drinkMnu fragment = new drinkMnu();
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

        lstDrink = new ArrayList<>();
        lstDrink.add(new Drink("Cerveja",
                "Todas as marcas.","13.00",R.drawable.beer));
        lstDrink.add(new Drink("Chá Gelado",
                "Chá matte gelado.","10.00",R.drawable.tea));
        lstDrink.add(new Drink("Suco",
                "Laranja, Limão, etc.","15.00",R.drawable.juice));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_drink_mnu, container, false);
        myrecyclerview2 = (RecyclerView) v.findViewById(R.id.drink_recyclerview);
        Drink_RecyclerViewAdapter recyclerAdapter2 = new Drink_RecyclerViewAdapter(getContext(),lstDrink);
        myrecyclerview2.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview2.setAdapter(recyclerAdapter2);

        return v;
    }
}
