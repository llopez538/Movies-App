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

        binding.recycler.adapter = MoviesAdapter(
            listOf(
                Movie("tile1", "url 1"),
                Movie("tile2", "url 1"),
                Movie("tile3", "url 1"),
                Movie("tile4", "url 1"),
                Movie("tile5", "url 1"),
                Movie("tile6", "url 1"),
                Movie("tile7", "url 1"),
                Movie("tile8", "url 1"),
                Movie("tile9", "url 1"),


                )
        )

    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("Rotate", "Mensaje de tipo String")
    }
}