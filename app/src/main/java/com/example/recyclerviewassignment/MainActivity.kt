package com.example.recyclerviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewassignment.Adapter.shopadapter
import com.example.recyclerviewassignment.model.shopping
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var shoplist = ArrayList<shopping>()
        shoplist.add(shopping("Fine Grain Sugar",20.00,"1 kg",R.drawable.sugar))
        shoplist.add(shopping("Peanuts",20.00,"3 kg",R.drawable.peanut))
        shoplist.add(shopping("Rice",80.00,"2 kg",R.drawable.rice))

        var Shopadapter = shopadapter(shoplist)

        shoprecycler.layoutManager = LinearLayoutManager(this)

        shoprecycler.adapter = Shopadapter
    }
}
