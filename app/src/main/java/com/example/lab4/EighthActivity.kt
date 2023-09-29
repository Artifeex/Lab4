package com.example.lab4

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import com.example.lab4.databinding.ActivityEighthBinding
import com.example.lab4.databinding.ActivityFifthBinding

class EighthActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityEighthBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.textView3.text = getString(R.string.progress_d, binding.seekBar.progress)
        binding.seekBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, progress: Int, p2: Boolean) {
                binding.textView3.text = getString(R.string.progress_d, progress)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })
    }

    companion object {
        fun newIntent(context: Context) = Intent(context, EighthActivity::class.java)
    }

}