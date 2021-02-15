package com.example.questionnaire

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_q8.*

var ar = IntArray(9)
class q8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q8)
        ar = intArrayOf(-1, -1, -1, -1, -1, -1, -1, -1,0)
    }
    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.q8_1_1 ->
                    if (checked) {
                        ar[0] = 1
                    }
                R.id.q8_1_2 ->
                    if (checked) {
                        ar[0] = 0
                    }
//------------
                R.id.q8_2_1 ->
                    if (checked) {
                        ar[1] = 2
                    }
                R.id.q8_2_2 ->
                    if (checked) {
                        ar[1] = 0
                    }

                //------------
                R.id.q8_3_1 ->
                    if (checked) {
                        ar[2] = 6
                        q8_3_e_s.visibility = View.VISIBLE
                    }
                R.id.q8_3_2 ->
                    if (checked) {
                        ar[2] = 0
                        q8_3_e_s.visibility = View.GONE
                    }

                //------------
                R.id.q8_3_e_1 ->
                    if (checked) {
                        ar[8] = 8
                    }
                R.id.q8_3_e_2 ->
                    if (checked) {
                        ar[8] = 0
                    }

                //------------
                R.id.q8_4_1 ->
                    if (checked) {
                        ar[3] = 8
                    }
                R.id.q8_4_2 ->
                    if (checked) {
                        ar[3] = 0
                    }

                //------------
                R.id.q8_5_1 ->
                    if (checked) {
                        ar[4] = 9
                    }
                R.id.q8_5_2 ->
                    if (checked) {
                        ar[4] = 0
                    }

                //------------
                R.id.q8_6_1 ->
                    if (checked) {
                        ar[5] = 4
                    }
                R.id.q8_6_2 ->
                    if (checked) {
                        ar[5] = 0
                    }

                //------------
                R.id.q8_7_1 ->
                    if (checked) {
                        ar[6] = 10
                    }
                R.id.q8_7_2 ->
                    if (checked) {
                        ar[6] = 0
                    }

                //------------
                R.id.q8_8_1 ->
                    if (checked) {
                        ar[7] = 4
                    }
                R.id.q8_8_2 ->
                    if (checked) {
                        ar[7] = 0
                    }



            }
        }
        var com = true
        ar.forEach {
            if(it == -1){
                com = false
            }
        }
        if(com){
            result.visibility = View.VISIBLE
            if(ar.sum() < 1){
                result.text = "ไม่มีแนวโน้มที่จะฆ่าตัวตายในปัจจุบัน"
            }else if (ar.sum() < 9){
                result.text = "แนวโน้มที่จะฆ่าตัวตายในปัจจุบัน ระดับน้อย"
            }else if (ar.sum() < 17){
                result.text = "แนวโน้มที่จะฆ่าตัวตายในปัจจุบัน ระดับปานกลาง"
            }else{
                result.text = "แนวโน้มที่จะฆ่าตัวตายในปัจจุบัน ระดับรุนเเรง"
            }
        }
    }
}