package com.example.list_view

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

     var col = arrayOf("Blue","Red","Gray","White","Black","Yellow","Dkgray","Cyan")
     var x= arrayOf(Color.BLUE,Color.RED,Color.GRAY,Color.WHITE,Color.BLACK,Color.YELLOW,Color.DKGRAY,Color.CYAN)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list=findViewById<ListView>(R.id.list)

        var ad:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.activity_list_item,col)
        list.adapter=ad

       list.setOnItemClickListener { parent, view, i, l ->
           var s=col[i]
           list.setBackgroundColor(x[i])
       }
    }
}