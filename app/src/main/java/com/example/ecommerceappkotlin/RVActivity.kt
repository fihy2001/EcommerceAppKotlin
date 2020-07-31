package com.example.ecommerceappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_r_v.*

class RVActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_r_v)

        var myProductsList = ArrayList<EProducts>()
        myProductsList.add(EProducts(0,"iPhone", 1000, R.drawable.iphone))
        myProductsList.add(EProducts(1,"Macbook", 2000, R.drawable.macbookair))
        myProductsList.add(EProducts(2,"iMac", 1500, R.drawable.imac))
        myProductsList.add(EProducts(3,"iPod Nano", 500, R.drawable.ipodnano))
        myProductsList.add(EProducts(4,"iPod Shuffle", 200, R.drawable.ipodshuffle))
        myProductsList.add(EProducts(5,"iPod Touch", 900, R.drawable.ipodtouch))

        var rvAdapter = RVAdapter(this@RVActivity, myProductsList)

        recyclerView.layoutManager = LinearLayoutManager(this@RVActivity)
        recyclerView.adapter = rvAdapter

    }
}