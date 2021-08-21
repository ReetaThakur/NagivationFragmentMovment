package com.example.nagivationfragmentmovment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_event_details.*


class EventDetailsFragment : Fragment(R.layout.fragment_event_details) {
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController=Navigation.findNavController(view)
        btnNext.setOnClickListener {
            val title=tvTitle.text.toString()
            val description=tvDescription.text.toString()
            val bundle=Bundle()
            bundle.putString("title",title)
            bundle.putString("dec",description)
            navController.navigate(R.id.action_eventDetailsFragment_to_timeAndDateFragment,bundle)
        }
    }

}