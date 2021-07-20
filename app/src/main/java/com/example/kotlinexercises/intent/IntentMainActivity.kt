package com.example.kotlinexercises.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.kotlinexercises.R

class IntentMainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)

        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)

    }

    override fun onClick(v: View?){
        when (v?.id){
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@IntentMainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }

            //putExtra() for sending data together using object intent, key-value
            R.id.btn_move_activity_data -> {
                val moveWithDataIntent = Intent(this@IntentMainActivity, MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME,"Amanda")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 18)
                startActivity(moveWithDataIntent)
            }

            R.id.btn_dial_number -> {
                val phoneNumber = "08232410271"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
        }
    }
}