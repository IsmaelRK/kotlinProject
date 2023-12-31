package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonHello.setOnClickListener {

            val nome = binding.editNome.text.toString()
            binding.textResult.text = "Olá " + nome

        }

    }
}