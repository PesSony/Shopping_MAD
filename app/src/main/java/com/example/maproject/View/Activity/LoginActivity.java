package com.example.maproject.View.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.maproject.databinding.LoginActivityBinding;

public class LoginActivity extends AppCompatActivity {

    private LoginActivityBinding binding;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = LoginActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(v -> startMainActivity());
    }
    private void startMainActivity()
    {

        Intent intent =new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
