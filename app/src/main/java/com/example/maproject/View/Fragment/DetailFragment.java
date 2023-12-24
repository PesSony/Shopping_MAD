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
import com.example.maproject.databinding.DetailLayoutBinding;

public class DetailFragment extends Fragment {


    private DetailLayoutBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DetailLayoutBinding.inflate(inflater, container,false);



        binding.btnBackDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment backProduct =new ProductFragment();
                FragmentTransaction fm = getFragmentManager().beginTransaction();
                fm.replace(R.id.layoutFragment,backProduct);
                fm.commit();
            }
        });

        return binding.getRoot();
    }
}
