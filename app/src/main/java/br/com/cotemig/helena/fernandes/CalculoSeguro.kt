package br.com.cotemig.helena.fernandes

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.NumberFormat

class CalculoSeguro : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo)

        var percentual = intent.getDoubleExtra("percentual", 0.0)

        var calcular = findViewById<Button>(R.id.calcular)
        calcular.setOnClickListener{
            calculaSeguro(percentual)
        }

    }

    private fun calculaSeguro(percentual: Double) {
        var valor = findViewById<EditText>(R.id.valor)
        var valorSeguro = valor.text.toString().toDouble()

        var seguro = (valorSeguro * percentual)/100.0
        var parcela = seguro/10.0

        var resultadoSeguro = findViewById<TextView>(R.id.resultadoSeguro)
        var resultadoParcela = findViewById<TextView>(R.id.resultadoParcela)

        var h = NumberFormat.getCurrencyInstance()

        resultadoSeguro.text = resources.getString(R.string.resultado_seguro, h.format(seguro))
        resultadoParcela.text = resources.getString(R.string.resultado_parcela, h.format(parcela))
    }
}