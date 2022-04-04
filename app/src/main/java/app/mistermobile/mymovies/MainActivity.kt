package app.mistermobile.mymovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import app.mistermobile.mymovies.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val message = findViewById<TextView>(R.id.message)
        message.text = "Cambiando el texto"
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Rotate", "Mensaje de tipo String")
    }
}