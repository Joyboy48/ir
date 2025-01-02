package com.example.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

class FragmentOne : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        //called when fragment is assoicatied with an activity
        Toast.makeText(context,
            "onAttach() is called",Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //called when the fragment is created
        Toast.makeText(context,
            "onCreate() is called",Toast.LENGTH_SHORT).show()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //called to create the view  hierarchy associated with the fragments
        Toast.makeText(context,
            "onCreateView() is called",Toast.LENGTH_SHORT).show()
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        //called when the fragment become visible to the user
        Toast.makeText(context,
            "onStart() is called",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        ///called when the fragment is visible and active
        Toast.makeText(context,
            "oneResume() is called",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        //called when the fragment is no longer interacting with the user
        Toast.makeText(context,
            "onPause() is called",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        //called when the fragment no longer visible to the user
        Toast.makeText(context,
            "onStop() is called",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        //called when the fragment i being destroy
        Toast.makeText(context,
            "onDestroy() is called",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        //called when the view hierarchy associaated with the fragment is removed
        Toast.makeText(context,
            "onDestroyView() is called",Toast.LENGTH_SHORT).show()
    }

    override fun onDetach() {
        super.onDetach()
        //fragment is being deassociated from the activity
        Toast.makeText(context,
            "onDetach() is called",Toast.LENGTH_SHORT).show()
    }
    }


