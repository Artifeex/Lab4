package com.example.lab4

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.Time
import android.widget.TimePicker
import com.example.lab4.databinding.ActivityFourthBinding
import java.util.Calendar

class FourthActivity : AppCompatActivity(), TimePickerFragment.TimePickerListener {

    private val binding by lazy {
        ActivityFourthBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupDefaultTime()
        binding.bnTimePick.setOnClickListener {
            TimePickerFragment().show(supportFragmentManager, null)
        }
    }

    private fun setupDefaultTime() {
        val calendar = Calendar.getInstance()
        val hours = calendar.get(Calendar.HOUR_OF_DAY)
        val minutes = calendar.get(Calendar.MINUTE)
        binding.tvTime.text = getString(R.string.time, hours, minutes)
    }

    override fun onTimeSet(p0: TimePicker?, hours: Int, minutes: Int) {
        binding.tvTime.text = getString(R.string.time, hours, minutes)
    }

    companion object {
        fun newIntent(context: Context) = Intent(context, FourthActivity::class.java)
    }
}