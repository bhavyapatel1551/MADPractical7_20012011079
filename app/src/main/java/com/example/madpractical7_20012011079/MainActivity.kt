package com.example.madpractical7_20012011079

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var alarmbutton=findViewById<Button>(R.id.alrmbtn1)
        alarmbutton.setOnClickListener{
            showTimeDilog()

        }
    }
    private fun showTimeDilog(){
        var calendar:Calendar=Calendar.getInstance()
        var hour:Int=calendar.get(Calendar.HOUR_OF_DAY)
        var minute:Int=calendar.get(Calendar.MINUTE)
        }
    }
