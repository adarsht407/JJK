package com.example.newsapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var datalist: ArrayList<News>, var context: Activity):
RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    private lateinit var myListener: onItemClickListener
    interface onItemClickListener  {
        fun onItemClicking(position: Int)
    }

    fun setonItemClickListener(listener: onItemClickListener){
        myListener=listener
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false)
        return MyViewHolder(itemView,myListener)
    }


    override fun getItemCount(): Int {
        return this.datalist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val curr=datalist[position]
        holder.title.text= curr.t
        holder.img.setImageResource(curr.img)
    }
    class MyViewHolder(itemView: View, listener: onItemClickListener):RecyclerView.ViewHolder(itemView) {
        val title=itemView.findViewById<TextView>(R.id.textView)
        val img=itemView.findViewById<ImageView>(R.id.imageView)
        init {
            itemView.setOnClickListener {
                listener.onItemClicking(adapterPosition)
            }
        }
    }

}
