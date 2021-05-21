package br.senai.sp.jandira.imc_app_b

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_resultado_ncd.*

class ResultadoNcdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ncd)


        val textViewResultadoNcd: TextView = findViewById(R.id.text_view_resultado_ncd)
        val peso = intent.getDoubleExtra("peso", 0.0)
        val idade = intent.getIntExtra("idade", 0)
        val genero = intent.getCharExtra("genero", 'm')
        val nivelAtividade = intent.getIntExtra("nivelAtividade", 0)


        val ncd = calcularNdc(genero, peso, idade, nivelAtividade)

        textViewResultadoNcd.text = String.format("%.2f", ncd)

        //Dicas NCD
        val dicasNcd = getDicasNcd()
        text_view_titulo_dica_ncd.text = dicasNcd[0]
        text_view_dica_ncd.text = dicasNcd[1]

    }
}