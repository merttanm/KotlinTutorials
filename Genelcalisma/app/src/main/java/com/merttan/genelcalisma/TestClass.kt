package com.merttan.genelcalisma

 open class TestClass (pFunc : (Any) -> Unit) {
     companion object{
         var println : (Any) -> Unit ={}
     }
     init {
         println = pFunc
     }
}