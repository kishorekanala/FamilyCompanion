package com.kishore.groceries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

val TAG = "GRO"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addButton: Button = findViewById<Button>(R.id.btn_Add)

        addButton.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                //TODO("Not yet implemented")
                Log.d(TAG, "Adding new item")

                val intent = Intent(this@MainActivity, GroceriesAddActivity::class.java)
                startActivity(intent)
            }
        })

    }
}