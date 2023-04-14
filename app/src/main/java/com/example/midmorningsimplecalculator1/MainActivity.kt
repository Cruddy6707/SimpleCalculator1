package com.example.midmorningsimplecalculator1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // Instantiate the User interface elements
    lateinit var mAnswer: TextView
    lateinit var mFnum : EditText
    lateinit var mSnum : EditText
    lateinit var mAdd : Button
    lateinit var mSub:  Button
    lateinit var mDiv : Button
    lateinit var mMul : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAnswer= findViewById(R.id.mTvAnswer)
        mFnum  = findViewById(R.id.mEdtFnum)
        mSnum  = findViewById(R.id.mEdtSNumber)
        mAdd   = findViewById(R.id.mBtnAdd)
        mSub   = findViewById(R.id.mBtnSub)
        mDiv   = findViewById(R.id.mBtnDiv)
        mMul   = findViewById(R.id.mBtnMul)
        // Set Onclick Listeners
        mAdd.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{//Proceed to compute the number
                var jibu = firstNumber.toDouble()+secondNumber.toDouble()
                //Display the answer on the textview answer
                mAnswer.text = jibu.toString()
            }
        }
        mSub.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{//Proceed to compute the number
                var jibu = firstNumber.toDouble()-secondNumber.toDouble()
                //Display the answer on the textview answer
                mAnswer.text = jibu.toString()
            }
        }
        mMul.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{//Proceed to compute the number
                var jibu = firstNumber.toDouble()*secondNumber.toDouble()
                //Display the answer on the textview answer
                mAnswer.text = jibu.toString()
            }
        }
        mDiv.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{//Proceed to compute the number
                var jibu = firstNumber.toDouble()/secondNumber.toDouble()
                //Display the answer on the textview answer
                mAnswer.text = jibu.toString()
            }
        }

    }

}