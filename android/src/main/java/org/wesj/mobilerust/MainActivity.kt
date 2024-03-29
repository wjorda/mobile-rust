package org.wesj.mobilerust

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.sample_text)
        val button = findViewById<Button>(R.id.hellobutton)

        button.setOnClickListener {
            val data = JNI.getATCFInfo(CycloneMessageRequest(2021, "al", 11))
            tv.append("\n${data.systemType} ${data.systemName}: ${data.systemIntensityMph} MPH")
        }
    }
}