package com.ahmad.triptomountain.gunung

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.ahmad.triptomountain.R
import com.ahmad.triptomountain.detail_gunung.DetailGunung
import com.bumptech.glide.Glide

class GunungAdapter(val items: List<ItemGunung>, val context: Context): RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
            = ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_grid_gunung,parent,false))

    override fun getItemCount(): Int = items.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items.get(position)

        holder.tvTitleGunung.text = item.titleGunung
        Glide.with(context)
            .load(item.imageGunung)
            .into(holder.imgGunung)
        holder.rootView.setOnClickListener {
            val intent = Intent(this.context,DetailGunung::class.java)
            intent.putExtra("data",item)
            context.startActivity(intent)
        }
    }

}

class ViewHolder(view: View): RecyclerView.ViewHolder(view){
    val tvTitleGunung : TextView = view.findViewById(R.id.namaGunung)
    val imgGunung : ImageView = view.findViewById(R.id.gambarGunung)
    val rootView : ConstraintLayout = view.findViewById(R.id.parentGunung)

}