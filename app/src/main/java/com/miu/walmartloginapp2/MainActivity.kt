package com.miu.walmartloginapp2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // Create array list
    val users = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        var user1 = User("Kalab", "Kebed", "kkebed@miu.edu", "123")
        var user2 = User("Kebede", "John", "kjohn@mmiu.edu", "123")
        var user3 = User("John", "Tomas", "jhon@miu.edu", "123")
        var user4 = User("Danial", "Jorge", "djorge@miu.edu", "123")
        var user5 = User("Anne", "Wolds", "awolds@miu.edu", "123")
        users.add(user1)
        users.add(user2)
        users.add(user3)
        users.add(user4)
        users.add(user5)
        signin.setOnClickListener {

            val email = emailAddr.text.toString()
            val passwd = password.text.toString()

            for (i in users) {
                if (email == i.username && passwd == i.password) {
                    var intent = Intent(this, ShoppingActivity::class.java)
                    intent.putExtra("1", email)
                    startActivity(intent)
                    return@setOnClickListener
                }

            }
            Toast.makeText(applicationContext, "User not found.", Toast.LENGTH_SHORT).show()
        }
        button2.setOnClickListener() {
            var intent_create = Intent(this, CreateAccount::class.java)
            startActivityForResult(intent_create, 2)

        }
        forgetP.setOnClickListener() {

            var email = emailAddr.text.toString()
            for (i in users) {
                if (email == i.username) {

                    var setIntent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"))
                    setIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
                    setIntent.putExtra(Intent.EXTRA_SUBJECT, "Recovered password:")
                    setIntent.putExtra(Intent.EXTRA_TEXT, "Password is: ${i.password}")
                    startActivity(Intent.createChooser(setIntent, "Sending via"))

                    return@setOnClickListener
                }

            }
            Toast.makeText(applicationContext, "User not found", Toast.LENGTH_SHORT).show()
        }
    }

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent)
        if (requestCode == 2) {
            if (resultCode == RESULT_OK) {
                var tmpUser = data?.getSerializableExtra("user") as User
                users.add(tmpUser)
                Toast.makeText(applicationContext, "User Added!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}