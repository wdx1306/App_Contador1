package jesus.cuvalles.miprimeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TercerActivity : AppCompatActivity() {

    lateinit var btnInicio: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercer)

        btnInicio = findViewById(R.id.Btn_Inicio)

        btnInicio.setOnClickListener {
            val miIntent4 = Intent(this, MainActivity::class.java)
            startActivity(miIntent4)
        }


    }
}