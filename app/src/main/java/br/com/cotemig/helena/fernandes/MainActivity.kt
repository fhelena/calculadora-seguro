package br.com.cotemig.helena.fernandes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = ArrayList<Faixa>()
        list.add(Faixa(5.0, "18 a 24 anos"))
        list.add(Faixa(4.0, "25 a 30 anos"))
        list.add(Faixa(3.5, "31 a 40 anos"))
        list.add(Faixa(3.3, "Acima de 40 anos"))

        var faixaIdade = findViewById<ListView>(R.id.listFaixa)
        faixaIdade.adapter = FaixaAdapter(this, list)

        faixaIdade.setOnItemClickListener { adapterView, view, i, l ->
            var intent = Intent(this, CalculoSeguro::class.java)
            intent.putExtra("percentual", list[i].percentual)
            startActivity(intent)
        }
    }
}