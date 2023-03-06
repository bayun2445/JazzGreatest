package com.example.jazzgreatest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.example.jazzgreatest.databinding.SplashScreenBinding

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    private lateinit var binding: SplashScreenBinding
    private lateinit var tvTitle: TextView
    private lateinit var ivSax: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tvTitle = binding.tvSplashTitle
        ivSax = binding.ivSax

        tvTitle.startAnimation(AnimationUtils.loadAnimation(this, R.anim.start_app_title))
        ivSax.startAnimation(AnimationUtils.loadAnimation(this, R.anim.start_app_title))

        Handler(Looper.getMainLooper()).postDelayed({
            Intent(this@SplashScreen, MainActivity::class.java).also {
                startActivity(it)
                finish()
                this.overridePendingTransition(0, R.anim.exit_splash)
            }
        }, 1200)
    }
}