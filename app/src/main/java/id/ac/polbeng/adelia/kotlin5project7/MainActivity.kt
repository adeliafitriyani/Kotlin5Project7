package id.ac.polbeng.adelia.kotlin5project7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.polbeng.adelia.kotlin5project7.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            Thread {
                killSomeTime()
            }.start()
        }
    }
    private fun killSomeTime() {
        for (i in 1..20) {
            runOnUiThread {
                binding.textView.text = i.toString()
            }
            Thread.sleep(2000)
            println("i: $i")
        }
    }
}