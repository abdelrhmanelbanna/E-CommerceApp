package com.example.e_commerceapp.ui.home

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.e_commerceapp.R
import com.example.e_commerceapp.databinding.ActivityHomeBinding
import com.example.e_commerceapp.ui.home.category.CategoryFragment
import com.example.e_commerceapp.ui.home.category.CategoryViewModel
import com.example.e_commerceapp.ui.home.favorite.FavoriteFragment
import com.example.e_commerceapp.ui.home.home.HomeFragment
import com.example.e_commerceapp.ui.home.profile.ProfileFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {


    lateinit var viewBinding :ActivityHomeBinding
    private val viewModel: HomeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        viewBinding = DataBindingUtil.setContentView(this,R.layout.activity_home)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        viewBinding.bottomNavigation.setOnItemSelectedListener { itemView->

            if(itemView.itemId==R.id.navigation_home){
                pushFragment(HomeFragment())
            }
            else if(itemView.itemId==R.id.navigation_category){
                pushFragment(CategoryFragment())
            }
            else if(itemView.itemId==R.id.navigation_favourite){
                pushFragment(FavoriteFragment())
            }
            else if(itemView.itemId==R.id.navigation_profile){
                pushFragment(ProfileFragment())
            }
            return@setOnItemSelectedListener true

        }
        viewBinding.bottomNavigation.selectedItemId=R.id.navigation_category

    }

    fun pushFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container,fragment)
            .commit()
    }
}