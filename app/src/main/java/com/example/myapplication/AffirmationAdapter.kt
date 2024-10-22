package com.example.myapplication


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AffirmationAdapter(private val affirmations: List<Affirmation>) :
    RecyclerView.Adapter<AffirmationAdapter.AffirmationViewHolder>() {

    class AffirmationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val affirmationText: TextView = itemView.findViewById(R.id.affirmationText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AffirmationViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_affirmation, parent, false)
        return AffirmationViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AffirmationViewHolder, position: Int) {
        val currentItem = affirmations[position]
        holder.affirmationText.text = currentItem.text
    }

    override fun getItemCount() = affirmations.size
}
