package com.example.feature_product_details_screen.presentation.adapters.images_adapter

import androidx.recyclerview.widget.DiffUtil

class ImagesProductDiffCallback : DiffUtil.ItemCallback<String>() {

	override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
		return oldItem == newItem
	}

	override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
		return oldItem == newItem
	}
}