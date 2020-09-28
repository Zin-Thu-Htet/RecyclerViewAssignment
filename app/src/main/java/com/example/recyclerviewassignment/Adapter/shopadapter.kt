package com.example.recyclerviewassignment.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewassignment.R
import com.example.recyclerviewassignment.model.shopping
import kotlinx.android.synthetic.main.item_shopping.view.*

class shopadapter (var shoplist : ArrayList<shopping>): RecyclerView.Adapter<shopadapter.shopViewHolder>() {

    class shopViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(shop: shopping){
            itemView.txtName.text = shop.name
            itemView.txtPrice.text = shop.price.toString()
            itemView.weightitem.text = shop.weight
            itemView.shopimg.setImageResource(shop.image)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): shopViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_shopping,parent,false)
        return shopViewHolder(view)
    }

    override fun getItemCount(): Int = shoplist.size

    override fun onBindViewHolder(holder: shopViewHolder, position: Int) {
        holder.bind(shoplist[position])
    }
}