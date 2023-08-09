package oop

class Hod (name:String, email:String, password:String):Teacher(name, email, password){

    fun suspendTeacher(){
        println("Yo, I can suspend a teacher")
    }
    fun scheduleMeeting(){
        println("Yo, I can schedule a meeting")
    }





}
