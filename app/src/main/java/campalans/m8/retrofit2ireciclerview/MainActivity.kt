package campalans.m8.retrofit2ireciclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import campalans.m8.retrofit2ireciclerview.superheroapp.SuperHeroListActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton: Button = findViewById(R.id.startButton)
        startButton.setOnClickListener {
            startActivity(Intent(this, SuperHeroListActivity::class.java))
        }
    }
}
