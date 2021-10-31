package com.kishore.groceries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class GroceriesAddEditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_groceries_addedit)

        val btnOK: Button = findViewById<Button>(R.id.btn_Ok)


        btnOK.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                //TODO("Not yet implemented")
                Log.d(TAG, "Everything Ok.. Accept")

                val intent = Intent(this@GroceriesAddEditActivity, MainActivity::class.java)
                startActivity(intent)
            }
        })

        val btnCancel: Button = findViewById<Button>(R.id.btn_Cancel)
        btnCancel.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                //TODO("Not yet implemented")
                Log.d(TAG, "Not Ok.. Reject")

                val intent = Intent(this@GroceriesAddEditActivity, MainActivity::class.java)
                startActivity(intent)
            }
        })

    }
}