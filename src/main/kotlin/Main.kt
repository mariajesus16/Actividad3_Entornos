fun posiciones(c: Int): Array<Int?> {
    val vector = arrayOfNulls<Int>(c)
    for (i in 0 until c) {
        vector[i] = 2 * i + c
    }
    return vector
}

fun main() {
    println("Número de posiciones de vector 1.")
    val c1 = readLine()!!.toInt()
    val v1 = posiciones(c1)
    println("Número de posiciones de vector 2.")
    val c2 = readLine()!!.toInt()
    val v2 = posiciones(c2)

    val matriz: Array<Array<Int?>> = arrayOf(v1, v2)
    for (i in 0 until 2) {
        println(matriz[i].contentToString())
    }
}