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


public class foodMnu extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Food> lstFood;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public foodMnu() {

    }


    public static foodMnu newInstance(String param1, String param2) {
        foodMnu fragment = new foodMnu();
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

        lstFood = new ArrayList<>();
        lstFood.add(new Food("Arroz com legumes", "Arroz com legumes com carne de panela.",
                "20.00",R.drawable.arroz));
        lstFood.add(new Food("Feijoada","Feijoada com arroz branco, couve e farofa.",
                "30.00",R.drawable.feijoada));
        lstFood.add(new Food("Muqueca","Muqueca de camarão cozido ao leite de coco com pimentão.",
                "30.00",R.drawable.moqueca));
        lstFood.add(new Food("Macarrão","Macarrão com molho bolonhesa.",
                "35.00",R.drawable.pasta));
        lstFood.add(new Food("Salada","Salada de legumes com tabule.",
                "10.00",R.drawable.salada));
        lstFood.add(new Food("Virado Paulista","Tutu de feijão com arroz branco, bisteca, couve refogada, ovo e bacon.",
                "15.00",R.drawable.virado));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_food_mnu, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.food_recyclerview);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstFood);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

}