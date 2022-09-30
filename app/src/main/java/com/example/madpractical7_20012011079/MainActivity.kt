package com.example.madpractical7_20012011079

import android.app.PendingIntent
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*
import java.util.logging.SimpleFormatter
import kotlin.math.min

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var alarmbutton=findViewById<Button>(R.id.alrmbtn1)
        alarmbutton.setOnClickListener{
            showTimeDialog()
        }
    }
    fun showTimeDialog()
    {
        val cldr: Calendar = Calendar.getInstance()
        val hour: Int = cldr.get(Calendar.HOUR_OF_DAY)
        val minutes: Int = cldr.get(Calendar.MINUTE)
        val picker = TimePickerDialog(
            this,
            { tp, sHour, sMinute -> sendDialogDataToActivity(sHour, sMinute) },
            hour,
            minutes,
            false
        )
        picker.show()
    }

    private fun sendDialogDataToActivity(sHour: Int, sMinute: Int) {
        val alarmCalendar=Calendar.getInstance()
        val year:Int=alarmCalendar.get(Calendar.YEAR)
        val month:Int=alarmCalendar.get(Calendar.MONTH)
        val day:Int=alarmCalendar.get(Calendar.DATE)
        alarmCalendar.set(year,month,day,sHour,sMinute,0)
        binding.textAlarmTime.text=SimpleFormatter("hh:mm:ss a").format(alarmCalendar.time)
    }
    override  fun setAlarm(millisTime:Long,str:String)
    {
        val intent = Intent(this,MyReceiver::class.java)
        intent.putExtra("Service1",str)
        val pendingIntent=PendingIntent.getBroadcast()
    }



}
