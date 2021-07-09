package com.example.dars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.util.Log
import io.paperdb.Paper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var count: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Paper.init(applicationContext)
        count = SaveData.getData()
        tvCount.text = count.toString()
         btnCount.setOnClickListener {
            count++
            tvCount.text = count.toString()
        }
        delete.setOnClickListener {
            SaveData.delete()
            count = 0
            tvCount.text = "0"
        }
    }

    override fun onPause() {
        super.onPause()
        SaveData.savedata(count)
        Log.e("pause", SaveData.getData().toString())
    }


}