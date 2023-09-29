package com.example.lab4

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.lab4.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityThirdBinding.inflate(layoutInflater)
    }

    private val viewModel by lazy {
        ViewModelProvider(this)[ThirdActivityViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        observeViewModel()
        setButtonClickListener()
    }

    private fun observeViewModel() {
        viewModel.countClicks.observe(this) {
            binding.button.text = getString(R.string.clicked_count, it)
        }
    }

    private fun setButtonClickListener() {
        binding.button.setOnClickListener {
            viewModel.click()
        }
    }

    companion object {
        fun newIntent(context: Context) = Intent(context, ThirdActivity::class.java)
    }
}