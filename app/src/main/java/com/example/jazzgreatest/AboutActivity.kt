package com.example.jazzgreatest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jazzgreatest.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setButtonBackClickListener()
    }

    private fun setButtonBackClickListener() {
        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}