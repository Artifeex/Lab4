package com.example.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setButtonsClickListeners()
    }

    private fun setButtonsClickListeners() {
        binding.bFirst.setOnClickListener {
            startActivity(FirstActivity.newIntent(this))
        }
        binding.bSecond.setOnClickListener {
            startActivity(SecondActivity.newIntent(this))
        }
        binding.bThird.setOnClickListener {
            startActivity(ThirdActivity.newIntent(this))
        }
        binding.bFourth.setOnClickListener {
            startActivity(FourthActivity.newIntent(this))
        }
        binding.bFifth.setOnClickListener {
            startActivity(FifthActivity.newIntent(this))
        }
        binding.bSixth.setOnClickListener {
            startActivity(SixthActivity.newIntent(this))
        }
        binding.bSeventh.setOnClickListener {
            startActivity(SeventhActivity.newIntent(this))
        }
        binding.bEighth.setOnClickListener {
            startActivity(EighthActivity.newIntent(this))
        }
    }
}