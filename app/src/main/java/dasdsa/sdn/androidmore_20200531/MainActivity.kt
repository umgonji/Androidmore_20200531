package dasdsa.sdn.androidmore_20200531

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

        Log.d("메일화면", "onCreate실행")
    }

    override fun onResume() {
        super.onResume()

        Log.d("메인화면", "onResume실행")
    }

    override fun onPause() {
        super.onPause()
        Log.d("메인화면", "onPause실행")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("메인화면", "onDestroy실행")
    }

    override fun onStop() {
        super.onStop()
        Log.d("메인화면", "onStop실행")
    }
    override fun setupEvents() {

        moveBtn.setOnClickListener {
            val myIntent = Intent(mContext, OtherActivity::class.java)
            startActivity(myIntent)
        }
    }

    override fun setValues() {
        val users = ArrayList<String>()
        users.add("조경진")
        users.add("홍길동")
        users.add("김영미")
        users.add("차오루")
        users.add("이철수")

        for (u in users) {
            Log.d("사용자이름", u)
        }

        for (i in 0..5) {
            Log.d("숫자반복", "${i}")
        }
    }


}
