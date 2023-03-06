package com.example.jazzgreatest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jazzgreatest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    companion object {
        lateinit var listLegend: ArrayList<Legend>
        lateinit var legendListAdapter: LegendListAdapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setButtonAboutClickListener()
        loadLegendData()
        setListAdapterClickListener()
    }

    private fun setListAdapterClickListener() {
        legendListAdapter.setClicked(object : LegendListAdapter.ItemClicked {
            override fun click(position: Int) {
                val legend = listLegend[position]

                Intent(this@MainActivity, DetailActivity::class.java).also {
                    it.putExtra("legend", legend)
                    startActivity(it)
                }
            }
        })
    }

    private fun loadLegendData() {
        listLegend = LegendData.listLegend
        legendListAdapter = LegendListAdapter(listLegend)
        binding.rvLegend.layoutManager = LinearLayoutManager(this)
        binding.rvLegend.adapter = legendListAdapter
    }

    private fun setButtonAboutClickListener() {
        binding.btnAbout.setOnClickListener {
            Intent(this@MainActivity, AboutActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}