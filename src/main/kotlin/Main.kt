fun main() {
    println("sumAll = ${sumAll(1, 5, 20)}")
    println("sumAll = ${sumAll()}")
    println("sumAll = ${sumAll(2, 3, 4, 5, 6, 7)}")
    println(createOutputString("Alice"))
    println(createOutputString("Bob", 23))
    println(createOutputString(isStudent = true, name = "Carol", age = 19))
    println(createOutputString("Daniel", 32, isStudent = null))
    println(multiplyBy(null, 4))
    println(multiplyBy(3, 4))
}

fun sumAll(vararg a:Int?):Int{

    return 0
}

fun createOutputString(vararg a:Any?){

}

fun multiplyBy(vararg a:Int?):Int{

    return 0
}