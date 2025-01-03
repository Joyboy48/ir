package com.example.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyPageAdapter(fm: FragmentManager,lc:Lifecycle)
    :FragmentStateAdapter(fm,lc)  {

        var fragmentsList: ArrayList<Fragment> = ArrayList()

    fun addFragmentToList(fragment: Fragment){
        fragmentsList.add(fragment)
    }

    override fun getItemCount(): Int {
        //return the total number of item in your ViewPage2
        return fragmentsList.size
    }

    override fun createFragment(position: Int): Fragment {
        //respopnsible for creating and returning a fragment
        //for a specific position within ViewPager2
        return fragmentsList.get(position)
    }
}