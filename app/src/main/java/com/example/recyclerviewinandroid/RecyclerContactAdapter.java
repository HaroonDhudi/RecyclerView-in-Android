package com.example.recyclerviewinandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    Context context;
    ArrayList<Contact_Model> arrContacts;

    RecyclerContactAdapter (Context context, ArrayList<Contact_Model>arrContacts){
        this.context = context;
        this.arrContacts = arrContacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.contactimage.setImageResource(arrContacts.get(position).image);
        holder.txtName.setText(arrContacts.get(position).name);
        holder.txtNumber.setText(arrContacts.get(position).number);

    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtName, txtNumber;
        ImageView contactimage;

        public ViewHolder(View itemview){
            super(itemview);

            txtName = itemview.findViewById(R.id.txtName);
            txtNumber = itemview.findViewById(R.id.txtNumber);
            contactimage = itemview.findViewById(R.id.contactimage);

        }

    }
}
