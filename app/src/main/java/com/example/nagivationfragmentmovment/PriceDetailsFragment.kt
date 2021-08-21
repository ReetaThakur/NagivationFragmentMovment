package com.example.nagivationfragmentmovment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_preview.*
import kotlinx.android.synthetic.main.fragment_price_details.*

class PriceDetailsFragment : Fragment(R.layout.fragment_price_details) {
     lateinit var  title:String
     lateinit var desc:String
     lateinit var startD:String
     lateinit var endD:String
     lateinit var startT:String
     lateinit var entT:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getData()
    }

    private fun getData() {
        arguments?.run {
            title=getString("title")!!
            desc=getString("dec")!!
            startD=getString("startDate")!!
            endD=getString("endDate")!!
            startT=getString("startTime")!!
            entT=getString("endTime")!!
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val price=tvPrice.text.toString()
        val currency=tvCurrency.text.toString()
        val intent=Intent(context,PreviewActivity::class.java)
        intent.putExtra("title",title)
        intent.putExtra("dec",desc)
        intent.putExtra("startDate",startD)
        intent.putExtra("endDate",endD)
        intent.putExtra("startTime",startT)
        intent.putExtra("endTime",entT)
        intent.putExtra("price",price)
        intent.putExtra("currency",currency)
        startActivity(intent)
    }

}