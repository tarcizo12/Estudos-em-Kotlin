package tarcizo_list

import java.util.Arrays

private fun promptInt(message: String): Int {
    print(message)
    return readLine()!!.toInt()
}

fun nullArray(): String {
    val array = IntArray(3)

    for(i in array.indices){
        array[i] = promptInt("Digite o numero ")
        if(array[i] == 0) array[i] = 1
    }

    return array.contentToString()

}

fun main() {

    print(nullArray())
}