package br.com.cotemig.helena.fernandes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class FaixaAdapter (var context: Context, var list: List<Faixa>) : BaseAdapter () {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
        return ""
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view  = LayoutInflater.from(context).inflate(R.layout.item_faixa, null)

        var faixa = view.findViewById<TextView>(R.id.faixa)
        faixa.text = list[p0].faixaIdade

        var percentual = view.findViewById<TextView>(R.id.percentual)
        percentual.text = String.format("%.2f", list[p0].percentual)

        return view
    }
}