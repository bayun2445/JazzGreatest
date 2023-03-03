@file:Suppress("DEPRECATION")

package com.example.jazzgreatest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jazzgreatest.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    private lateinit var legend: Legend

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadLegendDetail()
        setButtonClickListener()
    }

    private fun loadLegendDetail() {
        legend = intent.getParcelableExtra("legend")!!

        binding.ivLegendPhoto.setImageResource(legend.imageId!!)
        binding.tvLegendName.text = legend.name
        binding.tvBirthName.text = legend.birthName
        binding.tvBornDate.text = legend.born
        binding.tvDiedDate.text = legend.died
        binding.tvYearsActive.text = legend.yearsActive
        binding.tvInstrumentText.text = legend.instrument
        binding.tvPopularSong.text = legend.popularSong
        binding.tvSummary.text = legend.summary
    }

    private fun setButtonClickListener() {
        binding.btnBack.setOnClickListener {
            finish()
        }

        binding.btnShare.setOnClickListener {
            val nameQuery = legend.name?.replace(" ", "+")
            val songQuery = legend.popularSong?.replace(" ", "+")
            val youtubeQuery = "https://www.youtube.com/results?search_query=$songQuery+$nameQuery"
            val shareBody = "Hello! I'd like to share my favorite Jazz Legend. He/she is ${legend.name} who has popular song \"${legend.popularSong}\" \n\n Check it out on YouTube! $youtubeQuery"

            val shareIntent = Intent(Intent.ACTION_SEND).setType("text/plain")
                .putExtra(Intent.EXTRA_SUBJECT, "Jazz Greatest")
                .putExtra(Intent.EXTRA_TEXT, shareBody)

            startActivity(Intent.createChooser(shareIntent, "Share to"))
        }
    }
}