package com.miu.walmartloginapp2

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create_account.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_shopping.*
class ShoppingActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)
       var email1 = intent.getStringExtra("2")

        currUser.text = "Welcome "+ email1

            electronics.setOnClickListener() {
                val toast_electronics = Toast.makeText(
                    applicationContext,
                    "You have  chosen the  Electronics  category  of  shopping",
                    Toast.LENGTH_SHORT
                )
                toast_electronics.show()
            }

            clothes.setOnClickListener() {
                val toast_clothes = Toast.makeText(
                    applicationContext,
                    "You have  chosen the  Clothing  category  of  shopping",
                    Toast.LENGTH_SHORT
                )
                toast_clothes.show()
            }
            beauty.setOnClickListener() {
                val toast_beauty = Toast.makeText(
                    applicationContext,
                    "You have  chosen the  Beauty  category  of  shopping",
                    Toast.LENGTH_SHORT
                )
                toast_beauty.show()
            }
            food.setOnClickListener() {
                val toast_food = Toast.makeText(
                    applicationContext,
                    "You have  chosen the  Food  category  of  shopping",
                    Toast.LENGTH_SHORT
                )
                toast_food.show()
            }

    }
}


