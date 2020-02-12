package reynaldo.echeverria.myhealthapp


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MyHealthApp : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_health_app)


        val peso: EditText = findViewById(R.id.weight)as EditText
        val altura: EditText = findViewById(R.id.height)as EditText
        val calcular: Button = findViewById(R.id.calculate)as Button
        val imc: TextView = findViewById(R.id.imc)as TextView
        val rango: TextView = findViewById(R.id.range)as TextView

        calcular.setOnClickListener {
            var p: Float = peso.text.toString().toFloat()
            var a: Float = altura.text.toString().toFloat()

            var imc2:Float = p/(a*a)

            imc.setText(""+imc2)


            if(imc2 <= 18.5){
                rango.setBackgroundResource(R.color.Greenish)
                rango.setText("Por debajo de tu peso")
            }
            if(imc2 in 18.5 .. 24.9 ){
                rango.setBackgroundResource(R.color.Green)
                rango.setText("Saludable")
            }
            if(imc2 in 25.0 .. 29.9){
                rango.setBackgroundResource(R.color.Yellow)
                rango.setText("Sobrepeso")
            }
            if(imc2 in 30.0 .. 39.9 ){
                rango.setBackgroundResource(R.color.Orange)
                rango.setText("Obeso")
            }
            if(imc2 > 40){
                rango.setBackgroundResource(R.color.red)
                rango.setText("Estan en peligro de morir")

            }

        }




    }
}
