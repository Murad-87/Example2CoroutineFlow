package com.muslim.examplecoroutineflowforxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muslim.examplecoroutineflowforxml.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.buttonUsersActivity.setOnClickListener {
            startActivity(UsersActivity.newIntent(this))
        }
    }
}