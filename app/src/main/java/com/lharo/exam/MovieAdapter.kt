package com.lharo.exam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val dataEntries: List<MovieModel>) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textName: TextView = view.findViewById(R.id.textName)
        val textRating: TextView = view.findViewById(R.id.textRating)
        val textScore: TextView = view.findViewById(R.id.textScore)
        val textVotes: TextView = view.findViewById(R.id.textVotes)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentEntry = dataEntries[position]
        holder.textName.text = currentEntry.title
        holder.textRating.text = currentEntry.imdbRating
        holder.textScore.text = currentEntry.metascore
        holder.textVotes.text = currentEntry.imdbVotes
    }

    override fun getItemCount() = dataEntries.size
}