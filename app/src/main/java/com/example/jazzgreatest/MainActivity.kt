package com.example.jazzgreatest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jazzgreatest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setButtonAboutClickListener()
    }

    private fun setButtonAboutClickListener() {
        binding.btnAbout.setOnClickListener {
            Intent(this@MainActivity, AboutActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}