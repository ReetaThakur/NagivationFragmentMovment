package com.example.nagivationfragmentmovment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_time_and_date.*


class TimeAndDateFragment : Fragment(R.layout.fragment_time_and_date) {
    lateinit var title:String
    lateinit var desc:String
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getData()
    }

    private fun getData() {
        arguments?.run {
            title= getString("title")!!
            desc=getString("dec")!!
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController=Navigation.findNavController(view)
        btnClick.setOnClickListener {
            val startTime=tvStartTime.text.toString()
            val endTime=tvEndTime.text.toString()
            val startDate=tvStartDate.text.toString()
            val endDate=tvEndDate.text.toString()
            val bundle=Bundle()
            bundle.putString("startTime",startTime)
            bundle.putString("endTime",endTime)
            bundle.putString("startDate",startDate)
            bundle.putString("endDate",endDate)
            bundle.putString("title",title)
            bundle.putString("dec",desc)
            navController.navigate(R.id.action_timeAndDateFragment_to_priceDetailsFragment,bundle)
        }
    }

}