package com.companyname.startkotlin

fun main() {
    //회색은 사용한적이 없을 때 뜨는 것
    val hello1: String = "hello world"  //final 바꿀 수 없는 값
    // 대입해서 값 추론 가능할 때는 : String 생갹가능.
    val hello3 = "hello world"  //final 바꿀 수 없는 값
    var hello2: String = "hello world"  //int string, float 등 바꿀 수 있는 것

    //hello1 = "123" 불가능

    //자바는 String hello2 = null 이나 "123" 이나 가능했다.
    //코틀린은 그 경우가 ?를 통해 나뉜다.
    //?가 있다 : string에 null을 넣을 수 있다.
    //?가 없다 : string에 null 불가
    // 불가 => val h4:String = null
    hello()

    print(hello1)
    println(hello2)
    println(hello())
}

//            이게 반환값타입
fun hello(): String {
    return "hello fun!"
}
