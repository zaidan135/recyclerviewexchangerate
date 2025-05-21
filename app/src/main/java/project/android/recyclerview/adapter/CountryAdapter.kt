package project.android.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import project.android.recyclerview.R
import project.android.recyclerview.model.Country

class CountryAdapter(private val countries: List<Country>) :
    RecyclerView.Adapter<CountryAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageFlag: ImageView = view.findViewById(R.id.imageFlag)
        val textCountry: TextView = view.findViewById(R.id.textCountry)
        val textBuy: TextView = view.findViewById(R.id.textBuy)
        val textSell: TextView = view.findViewById(R.id.textSell)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_country, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val country = countries[position]
        holder.imageFlag.setImageResource(country.flagResId)
        holder.textCountry.text = country.name
        holder.textBuy.text = country.buyRate.toString()
        holder.textSell.text = country.sellRate.toString()
    }

    override fun getItemCount(): Int = countries.size
}

// Sabtu 17 Mei 2025

/*
NIM   : 10122231
NAMA  : Zaidan Febriandi
Kelas : IF-6
*/