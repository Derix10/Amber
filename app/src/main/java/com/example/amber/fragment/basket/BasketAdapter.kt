package com.example.amber.fragment.basket

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.amber.databinding.ItemBasketBinding
import com.example.domain.model.ItemModel

class BasketAdapter : RecyclerView.Adapter<BasketAdapter.BasketViewHolder>() {

    private val list: List<ItemModel> = ArrayList()
    private var conunt = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BasketViewHolder {
        val binding = ItemBasketBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BasketViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: BasketViewHolder, position: Int) {
        holder.onBing(list[position])
    }

    inner class BasketViewHolder(private val binding: ItemBasketBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBing(model: ItemModel) {
            binding.tvBasketPrice.text = model.price.toString()
            binding.tvBasketReview.text = model.descriptionProduct
            binding.tvBasketTitle.text = model.titleProduct
            Glide.with(binding.imgBasket)
                .load(model.imageProduct)
                .into(binding.imgBasket)
        }
    }
}