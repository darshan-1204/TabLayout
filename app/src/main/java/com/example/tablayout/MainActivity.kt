package com.example.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var fragments = arrayOf(ChatsFragment(),StatusFragment(),CallsFragment())
    var titles = arrayOf("CHATS","STATUS","CALLS")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homePages.adapter = HomePagesAdapter(supportFragmentManager,fragments,titles)
        binding.tabs.setupWithViewPager(binding.homePages)

    }
}