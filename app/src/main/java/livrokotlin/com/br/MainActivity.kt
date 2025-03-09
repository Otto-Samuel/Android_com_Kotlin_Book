package livrokotlin.com.br

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : Activity()
{
    // ❗ decorar isso
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        // definindo um Texto para ser exibido
        val texto = TextView(this)
        texto.text = "hello kotlin"

        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.meu_botao)
    }

}