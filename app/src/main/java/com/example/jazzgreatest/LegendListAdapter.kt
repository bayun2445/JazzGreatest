package com.example.jazzgreatest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class LegendListAdapter(private val listLegend: ArrayList<Legend>):
    RecyclerView.Adapter<LegendListAdapter.ListViewHolder>() {
    private lateinit var clicked: ItemClicked

    interface ItemClicked {
        fun click(position: Int)
    }

    fun setClicked(clicked: ItemClicked){
        this.clicked = clicked
    }

    class ListViewHolder(itemView: View, itemClicked: ItemClicked):
        RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_name)
        var tvInstrument: TextView = itemView.findViewById(R.id.tv_instrument)
        var ivPhoto: ImageView = itemView.findViewById(R.id.iv_photo)

        init {
            itemView.setOnClickListener{
                itemClicked.click(absoluteAdapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_legend_card_view, parent, false)

        return ListViewHolder(view, clicked)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val legend = listLegend[position]

        Glide.with(holder.itemView.context)
            .load(legend.imageId)
            .fitCenter()
            .into(holder.ivPhoto)

        holder.tvName.text = legend.name
        holder.tvInstrument.text = legend.instrument
    }

    override fun getItemCount(): Int {
        return listLegend.size
    }
}