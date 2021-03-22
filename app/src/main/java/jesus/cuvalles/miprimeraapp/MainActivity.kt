package jesus.cuvalles.miprimeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    //Declaration
    lateinit var btnprimero:Button
    lateinit var btnsegundo:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("mi app","Estoy en el metodo onCreate")

        //Initialization
        btnprimero =findViewById(R.id.Btn_SegundaVista)
        btnsegundo = findViewById(R.id.Btn_TerceraVista)



        btnprimero.setOnClickListener(View.OnClickListener {
            val miIntent = Intent(this,SegundaActivity::class.java)
            startActivity(miIntent)
        })

        btnsegundo.setOnClickListener(View.OnClickListener {
            val miIntent2 = Intent(this,TercerActivity::class.java)
            startActivity(miIntent2)
        })


    }


    override fun onStart() {
        super.onStart()
        Log.i("mi_app","Estoy en el metodo onStar")
    }

    override fun onPause() {
        super.onPause()
        Log.i("mi_app","Estoy en el metodo onPause")
    }




}