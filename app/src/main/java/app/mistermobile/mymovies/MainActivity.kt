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
                Movie("tile1", "https://loremflickr.com/320/240?lock=1"),
                Movie("tile2", "https://loremflickr.com/320/240?lock=2"),
                Movie("tile3", "https://loremflickr.com/320/240?lock=3"),
                Movie("tile4", "https://loremflickr.com/320/240?lock=4"),
                Movie("tile5", "https://loremflickr.com/320/240?lock=5"),
                Movie("tile6", "https://loremflickr.com/320/240?lock=6"),
                Movie("tile7", "https://loremflickr.com/320/240?lock=7"),
                Movie("tile8", "https://loremflickr.com/320/240?lock=8"),
                Movie("tile9", "https://loremflickr.com/320/240?lock=9")
                )
        ) { movie ->
            Toast
                .makeText(
                    this@MainActivity,
                    movie.title,
                    Toast.LENGTH_SHORT
                ).show()
        }

    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("Rotate", "Mensaje de tipo String")
    }
}