import kotlin.time.times

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

    println("")
    starFigure(5, 2, 2)
    println("")
    starFigure(1, 3, 2)
    println("")
    starFigure(1, 2, 4)

}

fun sumAll(vararg a: Int?): Int {
    var ret: Int = 0
    if (a.isNotEmpty()) {
        for (item in a) {
            ret += item!!
        }
    }
    return ret
}

fun createOutputString(name: String, age: Int = 42, isStudent: Boolean? = false): String =
    if (isStudent == true) {
        "student $name has age of $age"
    } else {
        "$name has age of $age"
    }

fun multiplyBy(a: Int?, b: Int?): Int? = if ((a != null) and (b != null)) {
    a!!.times(b!!)
} else {
    null
}

fun starFigure(a:Int, b:Int, c:Int){
    for (i in a.. (a+c*b) step c) println("*".repeat(i))
    for (i in (a+(c*b-c)) downTo a step c) println("*".repeat(i))
}