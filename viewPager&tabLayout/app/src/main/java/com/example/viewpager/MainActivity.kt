package com.example.viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    lateinit var viewPager2: ViewPager2
    lateinit var myPageAdapter: MyPageAdapter
    lateinit var tabLayout:TabLayout
    var tabsArray=arrayOf("My app","page 2","page 3")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1-initialise the viewpager
        viewPager2 = findViewById(R.id.viewPager2)
        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        //2-add fragment to the list in the adapter class
        myPageAdapter = MyPageAdapter(supportFragmentManager,lifecycle)
        myPageAdapter.addFragmentToList(FragmentOne())
        myPageAdapter.addFragmentToList(FragmentTwo())
        myPageAdapter.addFragmentToList(FragmentThree())

        //3-connect the adapter with viewpager2
        viewPager2.adapter = myPageAdapter

        //4-connecting tablayout with viewpager
        tabLayout= findViewById<TabLayout>(R.id.tablayout)
        TabLayoutMediator(
            tabLayout,
            viewPager2,
            ){
            tab,position ->
            //customise thhe tab label if needed

            //tab.text = "Tab ${position+1}"
            tab.text = tabsArray[position]
        }.attach()
    }
}