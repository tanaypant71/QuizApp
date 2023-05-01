package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val mName : TextView = findViewById(R.id.nameWin)
        val score: TextView = findViewById(R.id.score)
        val finish: Button = findViewById(R.id.finish)

        mName.text = intent.getStringExtra(Constants.USER_NAME)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        score.text = "Your Score is $correctAnswers out of $totalQuestions"

        finish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}