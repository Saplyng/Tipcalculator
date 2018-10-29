package aether.tipcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    var totalCharge: Double = 0.00

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        idButton.setOnClickListener {

            var chargeOfMeal = idMeal.text.toString().toDouble()
            val currency = DecimalFormat("$###,###.00")
            var tipPercent = idSpinner.selectedItem.toString().toDouble() / 100

            totalCharge = chargeOfMeal + (chargeOfMeal * tipPercent)
            val totalChargeFormatted = currency.format(totalCharge)


            textResult.text =
                    "The Total Cost of the bill with a ${idSpinner.selectedItem}% tip is: $totalChargeFormatted"
        }
    }
}
