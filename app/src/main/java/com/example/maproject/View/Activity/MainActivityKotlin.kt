package com.example.maproject.View.Activity


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.maproject.R
import com.example.maproject.View.Fragment.CardView
import com.example.maproject.View.Fragment.HomeFragment
import com.example.maproject.View.Fragment.MoreFragment
import com.example.maproject.View.Fragment.PageProfileFragment
import com.example.maproject.View.Fragment.ProductFragment
import com.example.maproject.databinding.ActivityMainBinding

class MainActivityKotlin: AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        println("This is Activity Running on Kotlin code");
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        showFragment(HomeFragment());

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId)
            {
                R.id.menuHome -> showFragment(HomeFragment());
                R.id.menuProduct -> showFragment(ProductFragment());
                R.id.menuCard -> showFragment(CardView());
                R.id.menuMore -> showFragment(MoreFragment());
                R.id.menuProfile -> showFragment(PageProfileFragment());

            }
            true;

        }
    };

    fun showFragment(fragment: Fragment)
    {
        var fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.layoutFragment,fragment);
        fragmentTransaction.commit();
    }
}