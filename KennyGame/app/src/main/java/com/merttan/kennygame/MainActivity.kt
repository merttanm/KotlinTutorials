package com.merttan.kennygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    var number = 0
    var score  = 0
    var runnable : Runnable = Runnable {  }
    var handler : Handler = Handler()
    var imageArray= ArrayList<ImageView>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ImageArray

        imageArray.add(Kenny1)
        imageArray.add(Kenny2)
        imageArray.add(Kenny3)
        imageArray.add(Kenny4)
        imageArray.add(Kenny5)
        imageArray.add(Kenny6)
        imageArray.add(Kenny7)
        imageArray.add(Kenny8)
        imageArray.add(Kenny9)

        hideImages()
        object : CountDownTimer(15500,1000){
            override fun onFinish() {

                textView.text = "Time: 0"

                handler.removeCallbacks(runnable)

                for (image in imageArray) {
                    image.visibility = View.INVISIBLE
                }



                //Alert
                val alert = AlertDialog.Builder(this@MainActivity)

                alert.setTitle("Game Over")
                alert.setMessage("Restart The Game?")
                alert.setPositiveButton("Yes") {dialog, which ->
                    //Restart
                    val intent = intent
                    finish()
                    startActivity(intent)


                }

                alert.setNegativeButton("No") {dialog, which ->
                    Toast.makeText(this@MainActivity,"Game Over",Toast.LENGTH_LONG).show()
                }

                alert.show()


            }

            override fun onTick(millisUntilFinished: Long) {
                textView.text = "Time: " + millisUntilFinished/1000
            }

        }.start()

    }

    fun hideImages(){
        runnable = object : Runnable {
            override fun run() {
                for (image in imageArray) {
                    image.visibility = View.INVISIBLE
                }

                var random = Random
                val randomIndex = random.nextInt(9)
                imageArray[randomIndex].visibility = View.VISIBLE

                handler.postDelayed(runnable,1300)
            }
        }
        handler.post(runnable)
    }


   fun skoruarttir(view : View){
       score= score +1
       textView2.text="Score: " +score

   }

}