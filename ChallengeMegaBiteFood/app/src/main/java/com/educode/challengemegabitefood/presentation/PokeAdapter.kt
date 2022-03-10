package com.educode.challengemegabitefood.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.educode.challengemegabitefood.databinding.ItemModifierBinding

class PokeAdapter: RecyclerView.Adapter<PokeAdapter.ViewHolder>() {
    var expand = false

    inner class ViewHolder(val binding: ItemModifierBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokeAdapter.ViewHolder {
        val binding = ItemModifierBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PokeAdapter.ViewHolder, position: Int) {
        with(holder){
            binding.expandedView.visibility = if (expand) View.VISIBLE else View.GONE
            // on Click of the item take parent card view in our case
            // revert the boolean "expand"
            binding.cardLayout.setOnClickListener {
                expand = !expand
                notifyDataSetChanged()
            }
        }
    }

    override fun getItemCount(): Int {
        return 50
    }
}