package dasdsa.sdn.androidmore_20200531

import android.os.Bundle
import android.util.Log

class OtherActivity : BaseActivity() {
    override fun setupEvents() {
    }

    override fun setValues() {
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)
        setupEvents()
        setValues()
        Log.d("다른화면", "onCreate실행")
    }

}
