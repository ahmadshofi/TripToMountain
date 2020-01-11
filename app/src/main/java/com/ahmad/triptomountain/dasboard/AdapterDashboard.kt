package com.ahmad.triptomountain.dasboard

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
import com.ahmad.triptomountain.chat.Chat
import com.ahmad.triptomountain.guide_porter.GuidePorter
import com.ahmad.triptomountain.gunung.ItemGunung
import com.ahmad.triptomountain.infromasiGunung.InformasiGunung
import com.ahmad.triptomountain.manajemenPerjalanan.ManajemenPerjalanan
import com.ahmad.triptomountain.ticket.Ticket
import com.ahmad.triptomountain.tips.PrefManager
import com.ahmad.triptomountain.tips.Tips
import com.bumptech.glide.Glide

class AdapterDashboard(val items: ArrayList<IconItem>, val context: Context) :
    RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_grid, parent, false))

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items.get(position)
        holder.tvTitle.text = item.title
        Glide.with(context)
            .load(item.image)
            .into(holder.img)
        holder.rootView.setOnClickListener {
            if (item.title == "Manajemen Peralatan") {
                val intent = Intent(this.context, ManajemenPerjalanan::class.java)
                context.startActivity(intent)
            } else if (item.title == "Informasi Gunung") {
                val intent = Intent(this.context, InformasiGunung::class.java)
                context.startActivity(intent)
            } else if (item.title == "Ticket") {
                val intent = Intent(this.context, Ticket::class.java)
                val item1 = intent.getParcelableExtra<ItemGunung>("detail")
                val harga = intent.getStringExtra("harga")
                intent.putExtra("detail", item1)
                intent.putExtra("harga", harga)
                context.startActivity(intent)
            } else if (item.title == "Chat") {
                val intent = Intent(this.context, Chat::class.java)
                context.startActivity(intent)
            } else if (item.title == "Guide & Porter") {
                val intent = Intent(this.context, GuidePorter::class.java)
                context.startActivity(intent)
            } else if (item.title == "Tips") {
                PrefManager(context).setLaunched(true)
                val intent = Intent(this.context, Tips::class.java)
                context.startActivity(intent)
            }
        }

    }

}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val tvTitle: TextView = view.findViewById(R.id.judulImage)
    val img: ImageView = view.findViewById(R.id.imageIcon)
    val rootView: ConstraintLayout = view.findViewById(R.id.parent)
}