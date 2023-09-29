package com.example.lab4

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.core.view.get
import com.example.lab4.databinding.ActivityFifthBinding
import com.example.lab4.databinding.ActivitySixthBinding

class SixthActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivitySixthBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupSpinner()

    }

    private fun setupSpinner() {
        ArrayAdapter.createFromResource(
            this,
            R.array.catNames,
            android.R.layout.simple_spinner_item
        ).also {adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.spinner.adapter = adapter
        }
        binding.spinner.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, pos: Int, id: Long) {
                val selectedView = parent?.getItemAtPosition(pos)
                binding.tvSpinner.text = selectedView.toString()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }

    companion object {
        fun newIntent(context: Context) = Intent(context, SixthActivity::class.java)
    }
}