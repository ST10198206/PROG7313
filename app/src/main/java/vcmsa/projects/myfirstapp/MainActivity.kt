package vcmsa.projects.myfirstapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Links to the XML layout

                val num1EditText = findViewById<EditText>(R.id.num1EditText)
                val num2EditText = findViewById<EditText>(R.id.num2EditText)
                val addButton = findViewById<Button>(R.id.addButton)
                val subButton = findViewById<Button>(R.id.subButton)
                val multipleButton = findViewById<Button>(R.id.mulButton)
                val divButton = findViewById<Button>(R.id.divButton)
                val resultTextView = findViewById<TextView>(R.id.resultTextView)
                val clearButton = findViewById<Button>(R.id.clearButton)

                addButton.setOnClickListener {
                    val num1Str = num1EditText.text.toString()
                    val num2Str = num2EditText.text.toString()

                    val num1 = num1Str.toIntOrNull()
                    val num2 = num2Str.toIntOrNull()

                    if (num1 != null && num2 != null) {
                        val sum = num1 + num2
                        resultTextView.text = "The sum is: $sum"
                    } else {
                        resultTextView.text = "Invalid input"
                    }
                }

        subButton.setOnClickListener {
            val num1Str = num1EditText.text.toString()
            val num2Str = num2EditText.text.toString()

            val num1 = num1Str.toIntOrNull()
            val num2 = num2Str.toIntOrNull()

            if (num1 != null && num2 != null) {
                val sum = num1 - num2
                resultTextView.text = "The sum is: $sum"
            } else {
                resultTextView.text = "Invalid input"
            }
        }

        multipleButton.setOnClickListener {
            val num1Str = num1EditText.text.toString()
            val num2Str = num2EditText.text.toString()

            val num1 = num1Str.toIntOrNull()
            val num2 = num2Str.toIntOrNull()

            if (num1 != null && num2 != null) {
                val sum = num1 * num2
                resultTextView.text = "The sum is: $sum"
            } else {
                resultTextView.text = "Invalid input"
            }
        }

        divButton.setOnClickListener {
            val num1Str = num1EditText.text.toString()
            val num2Str = num2EditText.text.toString()

            val num1 = num1Str.toIntOrNull()
            val num2 = num2Str.toIntOrNull()

            if (num1 != null && num2 != null) {
                val sum = num1 / num2
                resultTextView.text = "The sum is: $sum"
            } else {
                resultTextView.text = "Invalid input"
            }
        }

        clearButton.setOnClickListener {
            num1EditText.text.clear()
            num2EditText.text.clear()
            resultTextView.text = ""
        }


    }
        }



