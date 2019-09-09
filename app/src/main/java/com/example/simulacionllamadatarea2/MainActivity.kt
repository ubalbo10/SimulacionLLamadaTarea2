package com.example.simulacionllamadatarea2

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.VisibleForTesting
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.net.Uri


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var texto=findViewById<TextView>(R.id.txtMensaje)
        btn1.setOnClickListener {
            texto.text="${texto.text}1"

        }
        btn2.setOnClickListener {
            texto.text="${texto.text}2"
        }
        btn3.setOnClickListener {
            texto.text="${texto.text}3"
        }
        btn4.setOnClickListener {
            texto.text="${texto.text}4"
        }
        btn5.setOnClickListener {
            texto.text="${texto.text}5"
        }
        btn6.setOnClickListener {
            texto.text="${texto.text}6"
        }
        btn7.setOnClickListener {
            texto.text="${texto.text}7"
        }
        btn8.setOnClickListener {
            texto.text="${texto.text}8"
        }
        btn9.setOnClickListener {
            texto.text="${texto.text}9"
        }
        btn0.setOnClickListener {
            texto.text="${texto.text}0"
        }

        btnc.setOnClickListener {
            var mensaje=txtMensaje.text
            mensaje=mensaje.subSequence(0,mensaje.length-1)
            txtMensaje.text=mensaje
        }
        btnllamada.setOnClickListener {
            /*contenedorLlamada.setBackgroundColor(Color.WHITE)
            contenedorGeneral.setBackgroundColor(Color.RED)
            txtllamando.visibility=txtllamando.systemUiVisibility
            txtllamadaNumero.visibility=txtllamadaNumero.systemUiVisibility*/
            var dial = "tel:${texto.text}"
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse(dial)))
            //action_dial te da la llamada de el telefono pero guarda los numeros que e ingresado previamente
            // la magia es lanzar una activida nueva y decirle que es la llamada y pasarle el numero



        }






    }
}
