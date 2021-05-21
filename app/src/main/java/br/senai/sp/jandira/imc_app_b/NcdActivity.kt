package br.senai.sp.jandira.imc_app_b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_ncd.*

class NcdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ncd)

        val editTextPeso: EditText = findViewById(R.id.editText_peso_ncd)
        val spinnerIdade: Spinner = findViewById(R.id.spinner_idade)
        val radioFeminino: RadioButton = findViewById(R.id.radioFeminino_ncd)
        val radioMasculino: RadioButton = findViewById(R.id.radioMasculino_ncd)
        val spinnerAtividade: Spinner = findViewById(R.id.spinnerAtividade)
        val buttonCalcular: Button = findViewById(R.id.button_calcular_ncd)

        buttonCalcular.setOnClickListener {

            if (editTextPeso.text.isEmpty()) {
                editTextPeso.error = "Este campo é nescessário preencher"
            }

            if(!radioMasculino.isChecked && !radioFeminino.isChecked){
                radioMasculino.error="Escolha um genêro"
            }

            if (editTextPeso.text.isNotEmpty()) {
                val peso: Double = editTextPeso.text.toString().toDouble()
                val nivelAtividade = spinnerAtividade.selectedItemPosition
                val faixaEtaria = spinnerIdade.selectedItemPosition
                val intent = Intent(this, ResultadoNcdActivity::class.java)

                if (radioMasculino.isChecked) {
                    val genero = 'm'
                    intent.putExtra("genero", genero)
                } else {
                    val genero = 'f'
                    intent.putExtra("genero", genero)
                }

                intent.putExtra("peso", peso)
                intent.putExtra("nivelAtividade", nivelAtividade)
                intent.putExtra("idade", faixaEtaria)
                startActivity(intent)
            }
        }
    }
}