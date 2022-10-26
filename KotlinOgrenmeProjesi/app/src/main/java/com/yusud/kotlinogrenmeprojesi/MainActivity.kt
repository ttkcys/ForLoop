package com.yusud.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //For Loop
        println("---------------For Loop---------------")

        val arrayOfNumber = arrayOf(10,20,30,40,50,60)

        println("Start For loop")

        for(num in arrayOfNumber){
            println(num)
        }

        println("Finish For loop")
        println("------------------------------")
        println("Start For loop")

        for(num in arrayOfNumber){
            println(num / 5)
        }

        println("Finish For loop")
        println("------------------------------")
        println("Start For loop")

        for(index in arrayOfNumber.indices){
            println("Index: " + index)
        }

        println("Finish For loop")
        println("------------------------------")
        println("Start For loop")

        for(a in 0..9){
            println(a)
        }

        println("Finish For loop")
        println("------------------------------")

        var stringDizisi = ArrayList<String>()
        stringDizisi.add("Yusufhan")
        stringDizisi.add("Gözde")
        println("Start For loop")
        for(str in stringDizisi){
            println(str)
        }

        println("Finish For loop")
        println("------------------------------")

        stringDizisi.forEach {
            println(it)
        }




    }
}