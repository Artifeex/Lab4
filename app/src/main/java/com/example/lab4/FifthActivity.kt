package com.example.lab4

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.Time
import android.widget.DatePicker
import android.widget.TimePicker
import com.example.lab4.databinding.ActivityFifthBinding
import com.example.lab4.databinding.ActivityFourthBinding
import java.util.Calendar

class FifthActivity : AppCompatActivity(), DatePickerFragment.DatePickerListener {

    private val binding by lazy {
        ActivityFifthBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupDefaultDate()
        binding.bnDatePick.setOnClickListener {
            DatePickerFragment().show(supportFragmentManager, null)
        }
    }

    override fun onDateSet(p0: DatePicker?, year: Int, month: Int, day: Int) {
        binding.tvDate.text = getString(R.string.date, year, month + 1, day)
    }

    private fun setupDefaultDate() {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH) + 1
        val day = c.get(Calendar.DAY_OF_MONTH)

        binding.tvDate.text = getString(R.string.date, year, month, day)
    }

    companion object {
        fun newIntent(context: Context) = Intent(context, FifthActivity::class.java)
    }
}