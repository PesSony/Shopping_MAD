package com.example.maproject.View.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.maproject.API.model.Province
import com.example.maproject.Adapter.ProvinceAdapterKotlin
import com.example.maproject.databinding.FragmentMoreBinding

class ProvinceKotlin() : Fragment() {

    private lateinit var binding: FragmentMoreBinding;

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMoreBinding.inflate(inflater , container, false)
        return  binding.root;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(context);
        binding.recyclerview.layoutManager = layoutManager;

        val adapter = ProvinceAdapterKotlin();
    }


}