package app.babachan.calculator_f

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var answer: Int = 0
    var number: Int = 0
    private var operation: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)


        textView.text = "0"

        fun yellow(){
            plus.setBackgroundColor(Color.parseColor("#ffeb3b"))
            minus.setBackgroundColor(Color.parseColor("#ffeb3b"))
            multiplication.setBackgroundColor(Color.parseColor("#ffeb3b"))

        }

        val black = false
            plus.isPressed = black

        zero.setOnClickListener {
            number = number * 10 + 0
            textView.text = number.toString()

            if (zero.isPressed && black) {
                plus.setBackgroundColor(Color.parseColor("#ffeb3b"))
                minus.setBackgroundColor(Color.parseColor("#ffeb3b"))
                multiplication.setBackgroundColor(Color.parseColor("#ffeb3b"))
            }
        }

        one.setOnClickListener {
            number = number * 10 + 1
            textView.text = number.toString()

            plus.setBackgroundColor(Color.parseColor("#ffeb3b"))
            minus.setBackgroundColor(Color.parseColor("#ffeb3b"))
            multiplication.setBackgroundColor(Color.parseColor("#ffeb3b"))

        }

        two.setOnClickListener {
            number = number * 10 + 2
            textView.text = number.toString()

            plus.setBackgroundColor(Color.parseColor("#ffeb3b"))
            minus.setBackgroundColor(Color.parseColor("#ffeb3b"))
            multiplication.setBackgroundColor(Color.parseColor("#ffeb3b"))

        }

        three.setOnClickListener {
            number = number * 10 + 3
            textView.text = number.toString()

            plus.setBackgroundColor(Color.parseColor("#ffeb3b"))
            minus.setBackgroundColor(Color.parseColor("#ffeb3b"))
            multiplication.setBackgroundColor(Color.parseColor("#ffeb3b"))

        }

        four.setOnClickListener {
            number = number * 10 + 4
            textView.text = number.toString()

            plus.setBackgroundColor(Color.parseColor("#ffeb3b"))
            minus.setBackgroundColor(Color.parseColor("#ffeb3b"))
            multiplication.setBackgroundColor(Color.parseColor("#ffeb3b"))

        }

        five.setOnClickListener {
            number = number * 10 + 5
            textView.text = number.toString()

            plus.setBackgroundColor(Color.parseColor("#ffeb3b"))
            minus.setBackgroundColor(Color.parseColor("#ffeb3b"))
            multiplication.setBackgroundColor(Color.parseColor("#ffeb3b"))

        }

        six.setOnClickListener {
            number = number * 10 + 6
            textView.text = number.toString()

            plus.setBackgroundColor(Color.parseColor("#ffeb3b"))
            minus.setBackgroundColor(Color.parseColor("#ffeb3b"))
            multiplication.setBackgroundColor(Color.parseColor("#ffeb3b"))

        }

        seven.setOnClickListener {
            number = number * 10 + 7
            textView.text = number.toString()

            plus.setBackgroundColor(Color.parseColor("#ffeb3b"))
            minus.setBackgroundColor(Color.parseColor("#ffeb3b"))
            multiplication.setBackgroundColor(Color.parseColor("#ffeb3b"))

        }

        eight.setOnClickListener {
            number = number * 10 + 8
            textView.text = number.toString()

            plus.setBackgroundColor(Color.parseColor("#ffeb3b"))
            minus.setBackgroundColor(Color.parseColor("#ffeb3b"))
            multiplication.setBackgroundColor(Color.parseColor("#ffeb3b"))

        }

        nine.setOnClickListener {
            number = number * 10 + 9
            textView.text = number.toString()

            yellow()
        }

        fun calculate() {
            when (operation) {
                0 -> {
                    answer = number
                }
                1 -> {
                    answer += number
                }
                2 -> {
                    answer -= number
                }
                3 -> {
                    answer *= number
                }
                4 -> {
                    answer /= number
                }
            }
            number = 0
        }

        plus.setOnClickListener {
            calculate()
            operation = 1
            textView.text = "+"

        }
        minus.setOnClickListener {
            calculate()
            operation = 2
            textView.text = "-"
        }
        multiplication.setOnClickListener {
            calculate()
            operation = 3
            textView.text = "×"
        }

        if (plus.isPressed || minus.isPressed || multiplication.isPressed) {

            plus.setBackgroundColor(Color.parseColor("#e91e63"))
            minus.setBackgroundColor(Color.parseColor("#e91e63"))
            multiplication.setBackgroundColor(Color.parseColor("#e91e63"))

        }
        fun allClear() {
            answer = 0
            number = 0
            operation = 0
        }

        clear.setOnClickListener {
            allClear()
            textView.text = answer.toString()
        }

        equal.setOnClickListener {
            calculate()
            textView.text = answer.toString()
            allClear()
        }


    }
}

