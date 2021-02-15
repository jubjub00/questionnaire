package com.example.questionnaire

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_q2.*



class q2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q2)
        var qq_2_1 :Int = 0
        var qq_2_2 :Int = 0
        q2_1_y.setOnClickListener{
            qq_2_1 = 1
            ch(qq_2_1,qq_2_2)
        }
        q2_1_n.setOnClickListener{
            qq_2_1 = 2
            ch(qq_2_1,qq_2_2)
        }
        q2_2_y.setOnClickListener{
            qq_2_2 = 1
            ch(qq_2_1,qq_2_2)
        }
        q2_2_n.setOnClickListener{
            qq_2_2 = 2
            ch(qq_2_1,qq_2_2)
        }

    }
    fun ch(qq_2_1:Int,qq_2_2:Int){
        if(qq_2_1 != 0 && qq_2_2 != 0){
            if((qq_2_1 == 1 || qq_2_2 == 1) ){
                result.text = "คุณมีแนวโน้มที่จะเป็นโรคซึมเศร้า"
            }else{
                result.text = "คุณปกติ"
            }
        }
    }


}