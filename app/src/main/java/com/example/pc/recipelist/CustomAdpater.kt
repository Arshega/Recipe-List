package com.example.pc.recipelist

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.example.pc.recipelist.R.id.parent

/**
 * Created by PC on 12/5/2017.
 */
private val context: Context? = null
class CustomAdpater(val userList: ArrayList<User>) : RecyclerView.Adapter<CustomAdpater.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val user : User = userList[position]
        holder?.textViewName?.text = user.name
        holder?.textViewName2?.text = user.address


        holder?.linearLayout?.setOnClickListener(View.OnClickListener {
            val intent = Intent(context, Main2Activity::class.java)
            
        })
    }



    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.list_layout, parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userList.size
    }



    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textViewName = itemView.findViewById<TextView>(R.id.textViewUsername)
        val textViewName2 = itemView.findViewById<TextView>(R.id.textViewAddress)
        val linearLayout = itemView.findViewById<LinearLayout>(R.id.LinearLayout)
    }


}