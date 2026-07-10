package com.example.networkingyapis

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CharacterAdapter(private val characters: List<FuturamaCharacter>) :
    RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {
    class
    CharacterViewHolder(
        itemView:
        View
    ) :
        RecyclerView.ViewHolder(itemView) {
        val
                imageView:
                ImageView =
            itemView.findViewById(R.id.imageViewCharacter)
        val textView: TextView = itemView.findViewById(R.id.textViewName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            CharacterViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_character, parent, false)
        return CharacterViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = characters[position]
        holder.textView.text = character.name
        Glide.with(holder.itemView.context)
            .load(character.image)
            .into(holder.imageView)
    }

    override fun getItemCount(): Int = characters.size
}