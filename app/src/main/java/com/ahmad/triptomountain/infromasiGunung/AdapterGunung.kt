package com.ahmad.triptomountain.infromasiGunung

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.ahmad.triptomountain.R
import com.ahmad.triptomountain.etika_pendakian.EtikaPendakian
import com.ahmad.triptomountain.gunung.Gunung

class AdapterGunung(val items: ArrayList<GunungItem>, val context: Context):RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    = ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_porvinsi,parent,false))

    override fun getItemCount(): Int = items.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items.get(position)
        holder.tvTitleProvinsi.text = item.provinsi
        holder.rootView.setOnClickListener {
            val intent = Intent(this.context, Gunung::class.java)
            intent.putExtra("provinsi", item.provinsi)
            context.startActivity(intent)

        }
    }

}

class ViewHolder(view: View):RecyclerView.ViewHolder(view){
    val tvTitleProvinsi : TextView = view.findViewById(R.id.txtPovinsi)
    val rootView : ConstraintLayout = view.findViewById(R.id.parent_provinsi)
}