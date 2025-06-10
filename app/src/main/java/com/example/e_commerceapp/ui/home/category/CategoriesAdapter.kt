package com.example.e_commerceapp.ui.home.category

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.model.Category
import com.example.e_commerceapp.R
import com.example.e_commerceapp.databinding.ItemCategoryBinding

class CategoriesAdapter : ListAdapter<Category, CategoriesAdapter.ViewHolder>(CategoryDiffCallback()) {

    private var selectedPosition = RecyclerView.NO_POSITION

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemCategoryBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = getItem(position)
        holder.bind(category, position == selectedPosition)

        holder.itemView.setOnClickListener {
            val previousPosition = selectedPosition
            selectedPosition = position

            // Update old and new selected items
            notifyItemChanged(previousPosition)
            notifyItemChanged(selectedPosition)
        }
    }
    class ViewHolder(private val binding: ItemCategoryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(category: Category, isSelected: Boolean) {
            binding.category = category
            binding.executePendingBindings()

            // Change background and view visibility based on selection
            if (isSelected) {
                binding.root.setBackgroundColor(binding.root.context.getColor(R.color.white))
                binding.view.visibility = View.VISIBLE
            } else {
                binding.root.setBackgroundColor(binding.root.context.getColor(R.color.primary_light))
                binding.view.visibility = View.INVISIBLE
            }
        }
    }

    class CategoryDiffCallback : DiffUtil.ItemCallback<Category>() {
        override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean {
            return oldItem == newItem
        }
    }
}
