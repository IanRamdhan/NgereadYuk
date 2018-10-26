package com.fryanramzkhar.ngereadyuk;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    String[] namaRead,isiRead;

    public Adapter(Context context, String[] namaRead, String[] isiRead) {
        this.context = context;
        this.namaRead = namaRead;
        this.isiRead = isiRead;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_read,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, final int i) {
        viewHolder.txtRead.setText(namaRead[i]);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context, DetailRead.class);
                pindah.putExtra("nr", namaRead[i]);
                pindah.putExtra("dr", isiRead[i]);
                context.startActivity(pindah);
            }
        });
    }

    @Override
    public int getItemCount() {
        return namaRead.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtRead;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtRead = itemView.findViewById(R.id.txtListTitle);
        }
    }
}
