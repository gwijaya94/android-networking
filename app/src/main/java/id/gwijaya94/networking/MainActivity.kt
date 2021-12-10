package id.gwijaya94.networking

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.gwijaya94.networking.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toParsingJson.setOnClickListener {
            val activity = Intent(this,ParseJsonActivity::class.java)
            startActivity(activity)
        }
    }
}