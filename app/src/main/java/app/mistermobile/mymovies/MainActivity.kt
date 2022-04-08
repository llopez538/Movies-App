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

        binding.recycler.adapter = MoviesAdapter()

    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("Rotate", "Mensaje de tipo String")
    }
}