package com.example.lab4

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.RadioGroup.OnCheckedChangeListener
import com.example.lab4.databinding.ActivityFifthBinding
import com.example.lab4.databinding.ActivitySeventhBinding

class SeventhActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivitySeventhBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.switcher.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) {
                binding.textView2.text = getString(R.string.checked)
            } else {
                binding.textView2.text = getString(R.string.unchecked)
            }
        }
    }

    companion object {
        fun newIntent(context: Context) = Intent(context, SeventhActivity::class.java)
    }

}