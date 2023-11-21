package com.example.maproject


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.maproject.Fragment.HomeFragment
import com.example.maproject.Fragment.MoreFragment
import com.example.maproject.Fragment.ProductFragment
import com.example.maproject.Fragment.ProfileFragment
import com.example.maproject.Fragment.VideoFragment
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
                R.id.menuHome   -> showFragment(HomeFragment());
                R.id.menuVdo    -> showFragment(VideoFragment());
                R.id.menuProfile-> showFragment(ProfileFragment());
                R.id.menuProduct-> showFragment(ProductFragment());
                R.id.menuMore   -> showFragment(MoreFragment());
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