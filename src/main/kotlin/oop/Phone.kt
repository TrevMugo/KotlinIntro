package oop

class Phone(var name: String, var os: String, var charger: String) {

    fun call(phoneNumber: String){
        println("I can call the number $phoneNumber")
    }

    fun sms(phoneNumber: String){
        println("I can SMS the number $phoneNumber")
    }

    fun hungUp(phoneNumber: String){
        println("I can hung up on $phoneNumber")
    }



}