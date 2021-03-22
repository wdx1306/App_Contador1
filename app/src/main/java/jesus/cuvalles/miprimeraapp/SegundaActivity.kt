package jesus.cuvalles.miprimeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {
    var contador=0
    lateinit var btnsInicio: Button
    lateinit var  btnIncrementar: Button
    lateinit var tvContador: TextView
    lateinit var  btnDisminuir: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)
        btnIncrementar=findViewById(R.id.btn_incrementar)
        btnDisminuir =findViewById(R.id.btn_disminuir)
        btnsInicio =findViewById(R.id.Btn_Inicio)

        tvContador=findViewById(R.id.tvNumero)

        btnsInicio.setOnClickListener {
            val miIntent3 = Intent(this,MainActivity::class.java)
            startActivity(miIntent3)
        }

        btnIncrementar.setOnClickListener {
           if (contador <10) {
               contador++
               btnDisminuir.isEnabled = true
           } else{

                   btnIncrementar.isEnabled = false

            }

            tvContador.text = "$contador"

        }
        btnDisminuir.setOnClickListener {
            if (contador >0) {
                contador--
                btnIncrementar.isEnabled = true
            }
            else{
                btnDisminuir.isEnabled = false
            }

            tvContador.text = "$contador"
        }
        }}


