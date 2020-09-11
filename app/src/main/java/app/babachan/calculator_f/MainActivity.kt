package app.babachan.calculator_f

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

        zero.setOnClickListener {
            number = number * 10 + 0
            textView.text = number.toString()
        }

        one.setOnClickListener {
            number = number * 10 + 1
            textView.text = number.toString()
        }

        two.setOnClickListener {
            number = number * 10 + 2
            textView.text = number.toString()
        }

        three.setOnClickListener {
            number = number * 10 + 3
            textView.text = number.toString()
        }

        four.setOnClickListener {
            number = number * 10 + 4
            textView.text = number.toString()
        }

        five.setOnClickListener {
            number = number * 10 + 5
            textView.text = number.toString()
        }

        six.setOnClickListener {
            number = number * 10 + 6
            textView.text = number.toString()
        }

        seven.setOnClickListener {
            number = number * 10 + 7
            textView.text = number.toString()
        }

        eight.setOnClickListener {
            number = number * 10 + 8
            textView.text = number.toString()
        }

        nine.setOnClickListener {
            number = number * 10 + 9
            textView.text = number.toString()
        }

        fun calculate(){
            when (operation){
                0 -> {answer = number}
                1 -> { answer += number}
                2 -> { answer -= number}
                3 -> { answer *= number }
                4 -> { answer /= number }
            }
            number = 0
        }

        plus.setOnClickListener{
            calculate()
            operation = 1
            textView.text = "+"
        }
        minus.setOnClickListener{
            calculate()
            operation = 2
            textView.text = "-"
        }
        multiplication.setOnClickListener{
            calculate()
            operation = 3
            textView.text = "×"
        }
        division.setOnClickListener{
            calculate()
            operation = 4
            textView.text = "÷"
        }
        fun allClear(){
            answer = 0
            number = 0
            operation = 0
        }
        clear.setOnClickListener{
            allClear()
            textView.text = answer.toString()
        }

        equal.setOnClickListener{
            calculate()
            textView.text = answer.toString()
            allClear()
        }
    }
}