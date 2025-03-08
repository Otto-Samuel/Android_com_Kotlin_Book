package livrokotlin.com.br

import android.app.Activity
import android.os.Bundle
import android.widget.TextView


class MainActivity : Activity()
{
    // ❗ decorar isso
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        // definindo um Texto para ser exibido
        val texto = TextView(this)
        texto.text = "hello kotlin"

        setContentView(texto)
    }
}