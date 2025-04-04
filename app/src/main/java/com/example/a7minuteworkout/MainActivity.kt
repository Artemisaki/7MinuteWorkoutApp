package com.example.a7minuteworkout

import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a7minuteworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //  The binding is name just like the name of the layout with Binding attached
    private var binding:ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.flStart?.setOnClickListener {
            val intent = Intent(this,ExerciseActivity::class.java)
            startActivity(intent)
        }
        binding?.flBMI?.setOnClickListener {
            val intent = Intent(this, BMIActivity::class.java)
            startActivity(intent)
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}
    /*Way 1 of accessing their ids
        val flStartButton: FrameLayout = findViewById(R.id.flStart)
        flStartButton.setOnClickListener {
            Toast.makeText(this,"here we start", Toast.LENGTH_LONG).show()
    }
    Way 2 (safer) of accessing directly their ids
    because "findById" can be confused with same names
    binding?.flStart?.setOnClickListener {
        Toast.makeText(this@MainActivity,
            "here we start",
            Toast.LENGTH_LONG
        ).show()
    }
}*/

