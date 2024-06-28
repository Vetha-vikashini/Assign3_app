package com.example.assign3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView


class DressAdapter(private val dresslist: List<Dress>) :
    RecyclerView.Adapter<DressAdapter.DressViewHolder>() {

    class DressViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val dressImageView: ImageView = itemView.findViewById(R.id.imageview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DressViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview , parent ,false)
        return DressViewHolder(view)
    }

    override fun getItemCount(): Int {

        return dresslist.size
    }

    override fun onBindViewHolder(holder: DressViewHolder, position: Int) {

        val dress=dresslist[position]
        holder.dressImageView.setImageResource(dress.dressimage)
    }
}