package com.example.assign3

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.assign3.databinding.ActivityHomePageBinding

class HomePage : AppCompatActivity() {

    private lateinit var homePageBinding: ActivityHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        homePageBinding=ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(homePageBinding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        replaceFragment(Fraghome())
        homePageBinding.home.setOnClickListener{

            replaceFragment(Fraghome())
        }
        homePageBinding.category.setOnClickListener{

            replaceFragment(Fragcat())
        }
        homePageBinding.profile.setOnClickListener{

            replaceFragment(Profile())
        }

    }

    private fun replaceFragment(fragment: Fragment){

        supportFragmentManager.beginTransaction()
            .replace(R.id.homeFrag,fragment)
            .commit()
    }
}