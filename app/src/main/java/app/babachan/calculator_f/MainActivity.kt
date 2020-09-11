package app.babachan.calculator_f

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var answer: Int = 0
    var number: Int = 0
    var operation: Int = 0
    val textView: TextView = findViewById(R.id.textView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "0"

        zero.setOnClickListener {
            number = number * 10 + 0
            textView.setText(number)
        }

        one.setOnClickListener {
            number = number * 10 + 1
            textView.setText(number)
        }

        two.setOnClickListener {
            number = number * 10 + 2
            textView.setText(number)
        }

        three.setOnClickListener {
            number = number * 10 + 3
            textView.setText(number)
        }

        four.setOnClickListener {
            number = number * 10 + 4
            textView.setText(number)
        }

        five.setOnClickListener {
            number = number * 10 + 5
            textView.setText(number)
        }

        six.setOnClickListener {
            number = number * 10 + 6
            textView.setText(number)
        }

        seven.setOnClickListener {
            number = number * 10 + 7
            textView.setText(number)
        }

        eight.setOnClickListener {
            number = number * 10 + 8
            textView.setText(number)
        }

        nine.setOnClickListener {
            number = number * 10 + 9
            textView.setText(number)
        }

        fun calculate(){
            when (operation){
                0 -> {answer = number}
                1 -> {answer = answer + number}
                2 -> {answer = answer - number}
                3 -> {answer = answer * number}
                4 -> {answer = answer / number}
            }
            number = 0
        }

        fun plus(){
            calculate()
            operation = 1
            textView.text = ("+")
        }
        fun minus(){
            calculate()
            operation = 2
            textView.text = ("-")
        }
        fun multiplication(){
            calculate()
            operation = 3
            textView.text = ("×")
        }
        fun division(){
            calculate()
            operation = 4
            textView.text = ("÷")
        }
        fun allClear(){
            answer = 0
            number = 0
            operation = 0
        }
        fun clear(){
            allClear()
            textView.text = answer.toString()
        }
        fun equal(){
            calculate()
            textView.text = answer.toString()
            allClear()
        }
    }
}