package com.example.maproject.Adapter

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.maproject.API.model.Province
import com.example.maproject.API.model.ProvinceKotlin
import com.example.maproject.databinding.ViewHolderProvinceBinding
import com.squareup.picasso.Picasso

class ProvinceAdapterKotlin : ListAdapter<ProvinceKotlin,ProvinceAdapterKotlin.ViewHolderProvince>(
    object : DiffUtil.ItemCallback<ProvinceKotlin>(){
        override fun areItemsTheSame(oldItem: ProvinceKotlin, newItem: ProvinceKotlin): Boolean {
            return oldItem == newItem;
        }

        override fun areContentsTheSame(oldItem: ProvinceKotlin, newItem: ProvinceKotlin): Boolean {
            return oldItem.id == newItem.id;
        }

    }
) {

    class ViewHolderProvince(val itemBinding: ViewHolderProvinceBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(province: ProvinceKotlin) {
            Picasso.get().load(province.imageUrl).into(itemBinding.imgProvince);
            itemBinding.nameProvince.text = province.name;
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderProvince {

        val layout = LayoutInflater.from(parent.context)
        val binding = ViewHolderProvinceBinding.inflate(layout , parent , false)
        return  ViewHolderProvince(binding);
    }

    override fun onBindViewHolder(holder: ViewHolderProvince, position: Int) {
        val item = getItem(position);
        holder.bind(item);
    }

}

