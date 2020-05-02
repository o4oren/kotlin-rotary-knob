package geva.oren.rotaryknobdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RotaryKnobView.RotaryKnobListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        knob.listener = this
        textView.text = knob.value.toString()
    }

    override fun onRotate(value: Int) {
        textView.text = value.toString()
    }
}
