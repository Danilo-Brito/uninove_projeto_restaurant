package projeto.app.restaurantapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Context mContext;
    List<Food> mData;

    public RecyclerViewAdapter(Context mContext, List<Food> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_food,parent,false);
        ViewHolder vHolder = new ViewHolder(v);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.food_name.setText(mData.get(position).getFood_name());
        holder.food_description.setText(mData.get(position).getFood_description());
        holder.food_price.setText(mData.get(position).getFood_price());
        holder.food_image.setImageResource(mData.get(position).getFood_img());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends  RecyclerView.ViewHolder {

        private TextView food_name;
        private TextView food_description;
        private TextView food_price;
        private ImageView food_image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            food_name = (TextView) itemView.findViewById(R.id.food_name);
            food_description = (TextView) itemView.findViewById(R.id.food_description);
            food_price = (TextView) itemView.findViewById(R.id.price_food);
            food_image = (ImageView) itemView.findViewById(R.id.img_food);
        }
    }
}
