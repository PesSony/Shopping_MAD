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
import com.example.maproject.databinding.FragmentProductBinding;

public class ProductFragment extends Fragment {

    private FragmentProductBinding binding;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentProductBinding.inflate(inflater,container,false);


        binding.btnGo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment detailfragment = new DetailFragment();
                FragmentTransaction fm = getFragmentManager().beginTransaction();
                fm.replace(R.id.layoutFragment, detailfragment);

                fm.commit();

            }
        });

        binding.btngo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment detailfragment = new DetailFragment();
                FragmentTransaction fm = getFragmentManager().beginTransaction();
                fm.replace(R.id.layoutFragment, detailfragment);

                fm.commit();

            }
        });
        binding.btngo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment detailfragment = new DetailFragment();
                FragmentTransaction fm = getFragmentManager().beginTransaction();
                fm.replace(R.id.layoutFragment, detailfragment);

                fm.commit();

            }
        });
        binding.btng4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment detailfragment = new DetailFragment();
                FragmentTransaction fm = getFragmentManager().beginTransaction();
                fm.replace(R.id.layoutFragment, detailfragment);

                fm.commit();

            }
        });
        binding.btng5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment detailfragment = new DetailFragment();
                FragmentTransaction fm = getFragmentManager().beginTransaction();
                fm.replace(R.id.layoutFragment, detailfragment);

                fm.commit();

            }
        });

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public void onDestroy()
    {
        super.onDestroy();
        binding= null;

    };
}
