package com.example.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv: RecyclerView = findViewById(R.id.recyclerView)
        rv.layoutManager = LinearLayoutManager(this)

        val countrySet = listOf("Sri Lanka", "India", "England", "Africa", "Japan")
        val countryFlagSet = listOf(
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,

            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,

            )


        rv.adapter = MyAdapter(countrySet, countryFlagSet)

    }
}