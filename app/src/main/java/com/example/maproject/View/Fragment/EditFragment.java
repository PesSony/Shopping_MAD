package com.example.maproject.View.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.maproject.R;
import com.example.maproject.View.Activity.MainActivity;
import com.example.maproject.databinding.FragmentEditBinding;

public class EditFragment extends Fragment {


    FragmentEditBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentEditBinding.inflate(inflater,container,false);



        binding.btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment fragmentPF = new ProfileFragment();
                FragmentTransaction fm = getFragmentManager().beginTransaction();
                fm.replace(R.id.layoutFragment, fragmentPF);
                fm.commit();

            }
        });



        return binding.getRoot();

    }
}
