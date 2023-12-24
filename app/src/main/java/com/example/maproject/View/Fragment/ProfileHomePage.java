package com.example.maproject.View.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.maproject.R;
import com.example.maproject.databinding.ProfileHomePageBinding;

public class ProfileHomePage extends Fragment {
    private ProfileHomePageBinding binding;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = ProfileHomePageBinding.inflate(inflater,container,false);

        binding.btnBackHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment homeFragment = new HomeFragment();
                FragmentTransaction fm = getFragmentManager().beginTransaction();
                fm.replace(R.id.layoutFragment, homeFragment);

                fm.commit();

            }
        });

        binding.btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment editfragment = new EditFragment();
                FragmentTransaction fm = getFragmentManager().beginTransaction();
                fm.replace(R.id.layoutFragment, editfragment);

                fm.commit();

            }
        });


        return binding.getRoot();
    }
}
