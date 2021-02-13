package com.merttan.BasicSyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.CharSequenceTransformation
import java.lang.Double.sum
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    //sampleStart
    val PI = 3.14
    var vrbl = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello word")

        fun sum(a: Int, b: Int) = a + b
        fun multiplication(a: Int, b: Int) = a * b

        println("sum of 19 and 23 is ${sum(19, 23)}")
        println("multiplication of 3 and 4 is ${multiplication(3, 4)}")

        printSum(-1, 8)
        printmultiplication(5, 7)



        println("----------------Değişken Türleri--------------")
        val a : Int=1
        val b = 2
        val c : Int
        c=3
        println(" a =$a, b=$b, c=$c")

        // b=20 // Hata verir

        var x = 11
        x += 1
        println(" x=$x")

        println("----------------Mutable Objeler--------------")

        /*üzerine ekleme silme değiştirme gibi işlemler yapılabilir */

        val list =mutableListOf(1,2,3)
        list.add(4)
        println(list)// [1,2,3,4]




        println("----------------Top-Level Değişken Türleri--------------")
        println("vrbl=$vrbl; PI=$PI")
        increment()
        println("incrementX()")
        println("vrbl=$vrbl; PI=$PI")


        println("----------------Dize Örnekleri--------------")

        var d = 1
        val s1 = "a is $a"
        d =2
        val s2 = "${s1.replace("is" , "vas")}, but now is $a"
        println(s2)

        println("----------------Koşullu ifadeler--------------")

        println("max number is ${maxOf(5,10)}")

        println("----------------Nullable Değerler--------------")
        printProduct("6", "7")
        printProduct("a", "7")
        printProduct("a", "b")

        println("------------------------------")
        println(fullName)
        name="Numan"
        println(fullName)
        println("------------------------------")
        println(fizzy) //42
        println(buzz)  // CalculatE... 42

        /*
        Proje geliştirme aşamasında var atamak yerine val atanmalıdır.Sebebi ise sonradan
        programı senkronize etmek veya mantık yürütmek gerektiği zaman sorunların ana kaynağı
        olan mutasyon noktası sunmaz. Bu nedenle var yerine val tercih ediyoruz.
        */

        println("-----------Smart-Case----------")
        /*
        if(fullNameS != null){
            println(fullNameS2.length) //ERROR : Smart cast impossible
        }
        */

        if(fullNameS2 != null){
            println(fullNameS2.length) // Yalçın Bulut
        }

        println("-----------Mutable ve Read-Only collectionlar arasındaki farklar----------")

        val dizi=listOf(1,2,3)
        /*
        // Hatalı Down cating işlemi Hata verecek
        if(dizi is MutableList){
            dizi.add(4)
        }
        */


        //Doğru Down casting işlemi

        val dizi2=listOf(1,2,3)
        val mutableList =dizi2.toMutableList()
        mutableList.add(4)

        println(mutableList)

        /*
        val names : SortedSet<FullName> =TreeSet()
        val person : FullName ("AAA","AAA")
        names.add(person)
         */

        // User modelinden işlemler
        var user =User("MERT","TAN")
        user=user.copy(surname="ÇAKAR")
        println(user) // User (name=MERT, surname=ÇAKAR)
        println("-----------------------------------------------------------")

        // 2 şekilde liste oluşturup listeye eleman atama şekli
        val list1 :MutableList<Int> = mutableListOf()
        var list2 :List<Int> = listOf()
        list1.add(1453)
        list2 = list2 +1907
        println(list1)
        println(list2)
        println("-----------------------------------------------------------")
        list1 +=1
        list2 +=1
        println(list1)
        println(list2)
        println("-----------------------------------------------------------")
        list1.plusAssign(1)
        list2 = list2.plus(1)
        println(list1)
        println(list2)
        println("-----------------------------------------------------------")
        val list3 :MutableList<String> = mutableListOf()
        var list4 :List<String> = listOf()
        list3.add("Fatih")
        list4=list4 + "İstanbul"
        println(list3)
        println(list4)
        println("-----------------------------------------------------------")
        list3 += "Sultan"
        list4 += "İzmir"
        println(list3)
        println(list4)
        println("-----------------------------------------------------------")
        list3.plusAssign("Mehmet")
        list4 = list4.plus("Eskişehir")
        println(list3)
        println(list4)




            }







                inline fun<T ,R> Iterable<T>.map(transformation: (T) -> R) :List<R> {
                    val list = ArrayList<R>()
                    for (elem in this) {
                        list.add(transformation(elem))
                    }
                    return list
                }

            fun printSum(a: Int, b: Int): Unit {
                println("sum of $a and $b is ${a + b}")
            }
            fun printmultiplication(a: Int, b: Int): Unit {
                println("multiplication of $a and $b is ${a * b}")
            }
            fun increment(){
                vrbl +=1
            }

            fun maxOf( number1 : Int, number2 : Int ) : Int{
                if(number1>number2){
                    return number1
                }else {
                    return number2
                }
            }

            fun parseInt(str: String): Int? {
                return str.toIntOrNull()
            }
            fun printProduct(arg1: String, arg2: String) {
                val x = parseInt(arg1)
                val y = parseInt(arg2)
                    // Using `x * y` yields error because they may hold nulls.
                if (x != null && y != null) {
                    // x and y are automatically cast to non-nullable after null check
                    println(x * y)
                }
                else {
                    println("'$arg1' or '$arg2' is not a number")
                }
            }
            fun calculate():Int {
                print("Calculate... ")
                return 42
            }
            val fizzy=calculate()
            val buzz
            get()=calculate()


            var name : String ="Mesut"
            var surname: String="Ozil"
            val fullName
                get()="$name $surname"


                 // ----------------Smart-Casted--------------
            val nameS :String="Yalçın"
            val surnameS :String="Bulut"
            val fullNameS : String
            get() = nameS?.let { "$it $surnameS" }
            val fullNameS2 :String? =nameS.let { "$it $surnameS" }







}
