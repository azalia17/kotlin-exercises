package com.example.kotlinexercises

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.kotlinexercises.intent.IntentMainActivity
import com.example.kotlinexercises.recyclerview.RVMainActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIntentMoveActivity : Button = findViewById(R.id.btn_intent)
        btnIntentMoveActivity.setOnClickListener(this)

        val btnVolumeMoveActivity : Button = findViewById(R.id.btn_volume)
        btnVolumeMoveActivity.setOnClickListener(this)

        val btnViewsMoveActivity : Button = findViewById(R.id.btn_views)
        btnViewsMoveActivity.setOnClickListener(this)

        val btnRVMoveActivity : Button = findViewById(R.id.btn_rv)
        btnRVMoveActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        when (v?.id){
            R.id.btn_intent -> {
                val moveIntent = Intent(this@MainActivity, IntentMainActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_volume -> {
                val volumeIntent = Intent(this@MainActivity, VolumeCalculation::class.java)
                startActivity(volumeIntent)
            }
            R.id.btn_views -> {
                val viewsIntent = Intent(this@MainActivity, ViewAndViews::class.java)
                startActivity(viewsIntent)
            }
            R.id.btn_rv -> {
                val rvIntent = Intent(this@MainActivity, RVMainActivity::class.java)
                startActivity(rvIntent)
            }
        }
    }
}