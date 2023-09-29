package com.example.lab4

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.lab4.databinding.ActivityMainBinding
import com.example.lab4.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivitySecondBinding.inflate(layoutInflater)
    }

    private var isClicked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.bnClick.setOnClickListener {
            isClicked = !isClicked
            if(isClicked) {
                binding.bnClick.text = getString(R.string.clicked)
                binding.textView.text = getString(R.string.clicked)
                binding.bnClick.setBackgroundColor(getColor(R.color.clickedButton))
            } else {
                binding.bnClick.text = getString(R.string.unclicked)
                binding.textView.text = getString(R.string.unclicked)
                binding.bnClick.setBackgroundColor(getColor(R.color.unclickedButton))
            }
        }
    }

    companion object {
        fun newIntent(context: Context) = Intent(context, SecondActivity::class.java)
    }
}