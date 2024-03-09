package com.example.myfam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)
        bottomBar.setOnItemSelectedListener {

            if(it.itemId==R.id.nav_guard){
                inflateFragment()
            }else if (it.itemId==R.id.nav_home){
                inflateHomeFragment()
            }else if(it.itemId==R.id.nav_dashboard){
                inflateDashBoardFragment()
            }else{
                inflateProfileFragment()
            }

            true
        }
    }

    private fun inflateProfileFragment() {
        var transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,ProfileFragment.newInstance())
        transaction.commit()
    }

    private fun inflateDashBoardFragment() {
        var transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,DashFragment.newInstance())
        transaction.commit()
    }

    private fun inflateHomeFragment() {
        var transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,HomeFragment.newInstance())
        transaction.commit()

    }

    private fun inflateFragment() {

        var transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,GuardFragment.newInstance())
        transaction.commit()

    }


}