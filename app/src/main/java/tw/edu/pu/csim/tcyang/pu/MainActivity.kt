package tw.edu.pu.csim.tcyang.pu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (txv.text == "靜宜之美"){
            txv.text = "螢幕觸控"
        }
        else{
            txv.text = "靜宜之美"
        }
        return true
    }

}