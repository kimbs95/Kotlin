package com.example.stopwatch

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.KeyEvent
import android.widget.Toast
import com.example.stopwatch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    var start = 0L
    var stop = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener{
            binding.chronometer.base= SystemClock.elapsedRealtime() + stop
            binding.chronometer.start()
            binding.button2.isEnabled = true
            binding.button3.isEnabled = true
            binding.button.isEnabled = false
        }

        binding.button2.setOnClickListener {
            stop = binding.chronometer.base - SystemClock.elapsedRealtime()
            binding.chronometer.stop()
            binding.button2.isEnabled = false
            binding.button3.isEnabled = true
            binding.button.isEnabled = true
        }
        binding.button3.setOnClickListener{
            stop = 0L
            binding.chronometer.base = SystemClock.elapsedRealtime()
            binding.chronometer.stop()
            binding.button2.isEnabled = false
            binding.button3.isEnabled = false
            binding.button.isEnabled = true
        }
    }
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if(keyCode === KeyEvent.KEYCODE_BACK){
            if(System.currentTimeMillis() - start > 3000){
                Toast.makeText(this,"종료하려면 한번 더 누르세요",
                    Toast.LENGTH_SHORT).show()
                start = System.currentTimeMillis()
                return true
            }
        }
        return super.onKeyDown(keyCode, event)
    }

}
