package app.mistermobile.mymovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


import app.mistermobile.mymovies.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sendMovie.setOnClickListener {
            val message = binding.message.text
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }

        /*val titleMovie = binding.message.text
        val message = Toast.makeText(this, titleMovie, Toast.LENGTH_LONG)

        val button:Button = findViewById(R.id.sendMovie)
        button.setOnClickListener {
            message.show()
        }*/

        // val message = findViewById<TextView>(R.id.message)
        // message.text = "Cambiando el texto"
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("Rotate", "Mensaje de tipo String")
    }
}