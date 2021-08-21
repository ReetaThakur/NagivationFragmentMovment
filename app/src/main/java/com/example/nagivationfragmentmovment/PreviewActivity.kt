package com.example.nagivationfragmentmovment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_preview.*

class PreviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)
        getData()
    }

    private fun getData() {
        intent?.run {
            eventTitle.text=getStringExtra("title")
            eventDescription.text=getStringExtra("desc")
            startDate.text=getStringExtra("startDate")
            endDate.text=getStringExtra("endDate")
            startTime.text=getStringExtra("startTime")
            endTime.text=getStringExtra("endTime")
            price.text=getStringExtra("price")
        }
    }
}