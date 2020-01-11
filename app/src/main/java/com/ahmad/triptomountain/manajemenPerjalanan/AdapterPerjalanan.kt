package com.ahmad.triptomountain.manajemenPerjalanan

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
import com.ahmad.triptomountain.etika_pendakian.EtikaPendakian
import com.ahmad.triptomountain.perlengkapan.Perlengkapan
import com.ahmad.triptomountain.persiapan.Persiapan
import com.ahmad.triptomountain.transportasi.Transportasi
import com.bumptech.glide.Glide

class AdapterPerjalanan(val items: ArrayList<ItemPerjalanan>, val context: Context) :
    RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater.from(context).inflate(
            R.layout.list_item_grid_perjalanan,
            parent,
            false
        )
    )

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items.get(position)
        holder.tvTitle.text = item.titlePerjalanan
        Glide.with(context)
            .load(item.imagePerjalanan)
            .into(holder.img)
        holder.rootView.setOnClickListener {
            if (item.titlePerjalanan == "Etika Pendakian") {
                val intent = Intent(this.context, EtikaPendakian::class.java)
                context.startActivity(intent)
            } else if (item.titlePerjalanan == "Transportasi") {
                val intent = Intent(this.context, Transportasi::class.java)
                context.startActivity(intent)
            } else if (item.titlePerjalanan == "Perlengkapan") {
                val intent = Intent(this.context, Perlengkapan::class.java)
                context.startActivity(intent)
            }
            else if(item.titlePerjalanan == "Persiapan") {
                val intent = Intent(this.context, Persiapan::class.java)
                context.startActivity(intent)
            }
        }

    }

}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val tvTitle: TextView = view.findViewById(R.id.judulImage)
    val img: ImageView = view.findViewById(R.id.imageIconPerjalanan)
    val rootView: ConstraintLayout = view.findViewById(R.id.parent_perjalanan)
}