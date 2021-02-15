package com.example.questionnaire

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_q9.*

var arr = IntArray(9)
class q9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q9)
        arr = intArrayOf(-1, -1, -1, -1, -1, -1, -1, -1, -1)
    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.q9_1_1 ->
                    if (checked) {
                        arr[0] = 0
                    }
                R.id.q9_1_2 ->
                    if (checked) {
                        arr[0] = 1
                    }
                R.id.q9_1_3 ->
                    if (checked) {
                        arr[0] = 2
                    }
                R.id.q9_1_4 ->
                    if (checked) {
                        arr[0] = 3
                    }
//------------
                R.id.q9_2_1 ->
                    if (checked) {
                        arr[1] = 0
                    }
                R.id.q9_2_2 ->
                    if (checked) {
                        arr[1] = 1
                    }
                R.id.q9_2_3 ->
                    if (checked) {
                        arr[1] = 2
                    }
                R.id.q9_2_4 ->
                    if (checked) {
                        arr[1] = 3
                    }

                //------------
                R.id.q9_3_1 ->
                    if (checked) {
                        arr[2] = 0
                    }
                R.id.q9_3_2 ->
                    if (checked) {
                        arr[2] = 1
                    }
                R.id.q9_3_3 ->
                    if (checked) {
                        arr[2] = 2
                    }
                R.id.q9_3_4 ->
                    if (checked) {
                        arr[2] = 3
                    }

                //------------
                R.id.q9_4_1 ->
                    if (checked) {
                        arr[3] = 0
                    }
                R.id.q9_4_2 ->
                    if (checked) {
                        arr[3] = 1
                    }
                R.id.q9_4_3 ->
                    if (checked) {
                        arr[3] = 2
                    }
                R.id.q9_4_4 ->
                    if (checked) {
                        arr[3] = 3
                    }

                //------------
                R.id.q9_5_1 ->
                    if (checked) {
                        arr[4] = 0
                    }
                R.id.q9_5_2 ->
                    if (checked) {
                        arr[4] = 1
                    }
                R.id.q9_5_3 ->
                    if (checked) {
                        arr[4] = 2
                    }
                R.id.q9_5_4 ->
                    if (checked) {
                        arr[4] = 3
                    }

                //------------
                R.id.q9_6_1 ->
                    if (checked) {
                        arr[5] = 0
                    }
                R.id.q9_6_2 ->
                    if (checked) {
                        arr[5] = 1
                    }
                R.id.q9_6_3 ->
                    if (checked) {
                        arr[5] = 2
                    }
                R.id.q9_6_4 ->
                    if (checked) {
                        arr[5] = 3
                    }

                //------------
                R.id.q9_7_1 ->
                    if (checked) {
                        arr[6] = 0
                    }
                R.id.q9_7_2 ->
                    if (checked) {
                        arr[6] = 1
                    }
                R.id.q9_7_3 ->
                    if (checked) {
                        arr[6] = 2
                    }
                R.id.q9_7_4 ->
                    if (checked) {
                        arr[6] = 3
                    }

                //------------
                R.id.q9_8_1 ->
                    if (checked) {
                        arr[7] = 0
                    }
                R.id.q9_8_2 ->
                    if (checked) {
                        arr[7] = 1
                    }
                R.id.q9_8_3 ->
                    if (checked) {
                        arr[7] = 2
                    }
                R.id.q9_8_4 ->
                    if (checked) {
                        arr[7] = 3
                    }

                //------------
                R.id.q9_9_1 ->
                    if (checked) {
                        arr[8] = 0
                    }
                R.id.q9_9_2 ->
                    if (checked) {
                        arr[8] = 1
                    }
                R.id.q9_9_3 ->
                    if (checked) {
                        arr[8] = 2
                    }
                R.id.q9_9_4 ->
                    if (checked) {
                        arr[8] = 3
                    }

            }
        }
        var com = true
        arr.forEach {
            if(it == -1){
                com = false
            }
        }
        if(com){
            result.visibility = View.VISIBLE
            if(arr.sum() < 7){
                result.text = "ไม่มีอาการของโรคซึมเศร้าหรือมีอาการของโรคซึมเศร้าระดับน้อยมาก"
            }else if (arr.sum() < 13){
                result.text = "มีอาการของโรคซึมเศร้า ระดับน้อย"
            }else if (arr.sum() < 19){
                result.text = "มีอาการของโรคซึมเศร้า ระดับปานกลาง"
            }else{
                result.text = "มีอาการของโรคซึมเศร้า ระดับรุนเเรง"
            }
        }
    }
}