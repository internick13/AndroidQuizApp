package com.galosoft.androidquizapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import com.galosoft.androidquizapp.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ScoreDetailViewHolder extends RecyclerView.ViewHolder {

    public TextView txt_name, txt_score;

    public ScoreDetailViewHolder(@NonNull View itemView) {
        super(itemView);

        txt_name = itemView.findViewById(R.id.txt_name_category);
        txt_score = itemView.findViewById(R.id.txt_score);
    }
}
