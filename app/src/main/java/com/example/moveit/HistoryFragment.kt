package com.example.moveit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class HistoryFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_history, container, false)

        val backbtn = view.findViewById<Button>(R.id.historytoorders)
        backbtn.setOnClickListener {
            findNavController().navigate(R.id.action_historyFragment_to_orderFragment)
        }
        return view
    }
}