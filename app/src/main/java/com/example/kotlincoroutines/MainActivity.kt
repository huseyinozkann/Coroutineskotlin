package com.example.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Light Weightness
       /* GlobalScope.launch {
            repeat(100000){
                launch {
                    println("android")
                }
            }
        }*/

        //Scope
        //Global Scope, runBlocking, CoroutineScope

        //runBlocking
        //sonrasında yapılacak işlemleri bloklar.
       /* println("runBlocking Start")
        runBlocking {
            launch {
                delay(5000)
                println("run blocking")
            }
        }
        println("run blocking end")*/

        //Global Scope
       /* println("global scope start")
        GlobalScope.launch {
            delay(5000)
            println("global scope")
        }
        println("global scope end")*/

        //Coroutine Scope
        println("Coroutine Scope Start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("Coroutine Scope")
        }
        println("Coroutine Scope End")

        /*coroutineScope {  }
        hata verir çünkü ya suspend function içine
        ya da başka bir coroutine içine yazılır.
         */
    }
}