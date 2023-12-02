package com.ahmetensar.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.HashSet

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("---------------INTEGERS-----------------")

        var a : Int = 5
        var b : Int
        b = 15
        val c : Int = 20
        var byt : Byte = 127
        var shrt : Short = 123

        println(a)
        println(b)
        println(c)
        println(byt)
        println(shrt)

        println("---------------DOUBLE & FLOAT-----------------")

        var pi = 3.14
        val pi2 : Double = 3.14
        val pi3 = 3.14f
        val pi4 : Float = 3.14f

        println(pi)
        println(pi2)
        println(pi3)
        println(pi4)

        println("---------------STRING-----------------")

        val str1 = "Ahmet Ensar"
        var str2 : String = "Besir"

        println(str1)
        println(str2)



        println(str2.uppercase())

        println("--------------------------------")

        var number : String = "15"

        var n2 = number.toInt() + 11

        println(n2)

        println("---------------Collections-----------------")


        // Array
        println("---------------Array-----------------")
        val myArray = arrayOf("ahmet","ensar","besir")

        println(myArray[1])

        myArray[1] = "test"
        println(myArray[1])
        println(myArray)

        myArray.set(1,"ensar")

        println(myArray[1])

        val myNewArray = doubleArrayOf(1.2,3.1)
        val myMixArray = arrayOf('a',"Example",312,22.12,false)

        println(myMixArray[2])
        println(myMixArray[1])
        println(myMixArray[0])
        println(myMixArray[3])

        // ArrayList
        println("---------------ArrayList-----------------")

        val myList = ArrayList<Any>()

        myList.add('a')
        myList.add("test")
        myList.add(2)

        println(myList.toString())

        val myList2 = ArrayList<String>()

        myList2.add("ensar")
        myList2.add("besir")

        println(myList2.toString())
        println(myList2.count().toString())
        println("*******")

        val myList3 = arrayListOf<String>("one","two","three")
        println(myList3.count().toString())

        myList3.add("four")
        myList3.add("five")

        println(myList3.count().toString())

        var myList3Copy = ArrayList<String>()

        myList3Copy = myList3

        var myList2Copy = myList2

        println("myList3 ->" + myList3)
        println("myList3Copy ->" + myList3Copy)
        println("myList2Copy ->" + myList2Copy)

        myList3Copy.add(3,"ElementADD")

        println(myList3Copy)




        // Set
        println("--------------- Set -----------------")

        val mySet = setOf<Int>(1,2,3,1,3,2,1)

        println(mySet.size)

        println(mySet)

        println("*******")

        val myStringSet = HashSet<String>()

        myStringSet.add("Ahmet")
        myStringSet.add("Mehmet")
        myStringSet.add("Ahmet")
        myStringSet.add("Kerem")

        println(myStringSet)

        // Map
        println("--------------- Map -----------------")

        var myMap = hashMapOf<String,Int>()

        var myMap2 = HashMap<String,String>()

        myMap.put("Apple",100)
        myMap.put("Banana",120)
        myMap.put("Melon",10)
        myMap.put("Orange",12)

        println(myMap)
        println(myMap["Banana"])

        println("*******")

        myMap2.put("Ahmet","Besir")
        myMap2.put("Ensar","test")
        myMap2.put("Test","123")

        println(myMap2)

        println("*******")

        val myMap3 = hashMapOf<String,Int>("Orange" to 300, "Melon" to 280)

        println(myMap3)

        println("-----------------------------------")
        var m = 5
        m++
        m = m + 1

        println(++m)

        // İF-ELSE
        println("--------------- if -----------------")

        val myNumber = 28

        if (myNumber < 30){
          println("< 30")
        } else if (myNumber >= 30 && myNumber < 40){
            println("30 - 40")
        }else if (myNumber >= 40 && myNumber < 50){
            println("40 - 50")
        } else {
            println(">= 50")
        }
        // SWİTCH (when)
        println("--------------- switch-when -----------------")

        val day = 3
        var dayString = ""


        when(day){
            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            4 -> dayString = "Thursday"
            5 -> dayString = "Friday"
            6 -> dayString = "Saturday"
            7 -> dayString = "Sunday"
            else -> dayString = "Wrong Number!"
        }

        println(dayString)

        // Loops
        // for loop
        println("--------------- for loop -----------------")

        val arrayNumbers = arrayOf(12,15,18,33,54,126)
        val q = arrayNumbers[0] / 3 * 5
        println(q)

        println("*******")

        for (number in arrayNumbers){ // for each'in bir versiyonu
            val z = number / 3 * 5
            println(z)
        }
        arrayNumbers.forEach { println(it / 3 * 5) } // klasik forEach - 'it' anahtar kelimesiyle indisteki elemanı veriyor.
        println("*******")

        for (i in arrayNumbers.indices){ // dizideki indisi 'i' değişkenine alıyor
            val qz = arrayNumbers[i] / 3 * 5
            println(qz)
        }

        for (b in 0..9) { // 0'dan 9'a kadar sırayla b'ye alıyor
            println(b)
        }

        // while loop
        println("--------------- while -----------------")

        var j = 0

        while (j < 10){
            j++
            println(j)
        }

    }

}