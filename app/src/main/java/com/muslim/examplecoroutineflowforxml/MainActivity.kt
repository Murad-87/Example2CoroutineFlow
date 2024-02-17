package com.muslim.examplecoroutineflowforxml

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.muslim.examplecoroutineflowforxml.crypto_app.CryptoActivity
import com.muslim.examplecoroutineflowforxml.databinding.ActivityMainBinding
import com.muslim.examplecoroutineflowforxml.team_score.TeamScoreActivity

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
        binding.buttonCryptoActivity.setOnClickListener {
            startActivity(CryptoActivity.newIntent(this))
        }
        binding.teamScoreActivity.setOnClickListener {
            startActivity(TeamScoreActivity.newIntent(this))
        }

        val context = this.applicationContext
    }
}