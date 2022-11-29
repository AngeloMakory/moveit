package com.example.moveit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class OrderFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_order, container, false)

        val statusbtn = view.findViewById<Button>(R.id.orderstostatus)
        statusbtn.setOnClickListener{
            findNavController().navigate(R.id.action_orderFragment_to_statusFragment)
        }

        val helpbtn = view.findViewById<Button>(R.id.orderstohelp)
        helpbtn.setOnClickListener{
            findNavController().navigate(R.id.action_orderFragment_to_helpFragment)
        }

        val historybtn = view.findViewById<Button>(R.id.orderstohistory)
        historybtn.setOnClickListener{
            findNavController().navigate(R.id.action_orderFragment_to_historyFragment)
        }

        val profilebtn = view.findViewById<Button>(R.id.orderstoprofile)
        profilebtn.setOnClickListener {
            findNavController().navigate(R.id.action_orderFragment_to_profileFragment)
        }

        return view
    }
}