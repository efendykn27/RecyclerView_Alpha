package com.latihan.recyclerview2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.latihan.recyclerview2.R
import com.latihan.recyclerview2.model.AlpaChar

class AlphaAdapters(var context: Context, var arrayList: ArrayList<AlpaChar>):
    RecyclerView.Adapter<AlphaAdapters.ItemHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {

        val itemHolder = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_layout, parent, false)
        return ItemHolder(itemHolder)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var alpaChar : AlpaChar = arrayList.get(position)

        holder.icons.setImageResource(alpaChar.iconsChat!!)
        holder.alphas.text = alpaChar.alpaChar

        holder.alphas.setOnClickListener{
            Toast.makeText(context, alpaChar.alpaChar, Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size

    }
    class ItemHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var icons : ImageView = itemView.findViewById(R.id.icon_image)
        var alphas : TextView = itemView.findViewById(R.id.alpha_text_view)
    }

}