package com.example.maproject.View.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.maproject.databinding.CardViewFragmentBinding;

public class CardView extends Fragment {

    private CardViewFragmentBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = CardViewFragmentBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}
