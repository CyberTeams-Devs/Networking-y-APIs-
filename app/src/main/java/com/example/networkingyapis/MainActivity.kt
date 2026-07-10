package com.example.networkingyapis

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val call = ApiClient.apiService.getCharacters(page = 3, size = 15)

        call.enqueue(object : Callback<CharacterResponse> {
            override fun onResponse(
                call: Call<CharacterResponse>, response: retrofit2.Response<CharacterResponse>
            ) {
                if (response.isSuccessful) {
                    val characters = response.body()?.items ?: emptyList<FuturamaCharacter>()
                    characters.forEach {
                        Log.d("Futurama:", "${it.name} - ${it.gender} - ${it.species}")
                    }
                } else {
                    Toast.makeText(
                        this@MainActivity,
                        "Error: ${response.code()}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

            override fun onFailure(call: Call<CharacterResponse>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Fallo: ${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }
}