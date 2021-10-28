package com.example.t3_zegarraherrera.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.t3_zegarraherrera.Pokemons;
import com.example.t3_zegarraherrera.R;

import java.util.List;

public class PokesAdapter extends  RecyclerView.Adapter<PokesAdapter.NameViewHolder> {

    public List<Pokemons> data;

    public PokesAdapter(List<Pokemons> data) {
        this.data = data;
    }

    @Override
    public NameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_name2,parent,false);
        return new NameViewHolder(view);
    }

    @Override
    public void onBindViewHolder( NameViewHolder holder, int position) {
        TextView tvnombre = holder.itemView.findViewById(R.id.MisPoke);
        TextView tvurl = holder.itemView.findViewById(R.id.MisPoke);
        TextView tvtipo = holder.itemView.findViewById(R.id.MisPoke);
        TextView tvlati = holder.itemView.findViewById(R.id.MisPoke);
        TextView tvlongi = holder.itemView.findViewById(R.id.MisPoke);
        Pokemons poke = data.get(position);
        tvnombre.setText(String.valueOf(poke.getNombre()));
        tvurl.setText(String.valueOf(poke.getUrl()));
        tvtipo.setText(String.valueOf(poke.getTipo()));
        tvlati.setText(String.valueOf(poke.getLatitud()));
        tvlongi.setText(String.valueOf(poke.getLongitud()));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class NameViewHolder extends  RecyclerView.ViewHolder{
        public NameViewHolder(View itemView){
            super(itemView);
        }
    }
}
