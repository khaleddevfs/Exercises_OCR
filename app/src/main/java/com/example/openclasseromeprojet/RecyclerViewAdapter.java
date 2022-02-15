package com.example.openclasseromeprojet;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;


import java.util.List;


import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private final List<Player> players;
    private final Context mContext;
    private AdapterView.OnItemClickListener mListener;

    public interface Listener {
        void onClickDelete(Player myPokemonBank);
        void onItemClick(Player item);
    }

    private Listener callback;



   /* public interface OnItemClickListener {
        void onDeleteClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }*/


    public RecyclerViewAdapter(List<Player> players, Context context) {
        this.players = players;
        mContext = context;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitems, parent, false);
        return new ViewHolder(parent,view);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Player player = players.get(position);
        Glide.with(mContext)
                .asBitmap()
                .load(player.getImageUrl())
                .into(holder.imageUrl);

        holder.imageName.setText(player.getName());

    }


    @Override
    public int getItemCount() {
        return players.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        CircleImageView imageUrl;
        TextView imageName;
        LinearLayout parentLayout;
        ImageView mDeleteImage;


        public ViewHolder(View itemView, final View listener) {
            super(itemView);
            imageUrl = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
            parentLayout = itemView.findViewById(R.id.parent_layout);
            mDeleteImage = itemView.findViewById(R.id.image_delete);

            mDeleteImage.setOnClickListener(view -> callback.onClickDelete((Player) players));
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    callback.onItemClick((Player) players);
                }
            });
        }

        @Override
        public void onClick(View v) {

        }
    }
            }


























