package tarcizo_list

import java.util.Arrays

private fun promptInt(message: String): Int {
    print(message)
    return readLine()!!.toInt()
}

fun compareArrays(){
    val array = IntArray(3)
    val arrayFilter = IntArray(3)
    var i = 0

    for(i in array.indices) array[i] = promptInt("Digite o numero ")

    print("O array filtrado e comparado fica: ")
    array.filter{it >0}.forEach{
        arrayFilter[i] = it
        print("$it ")
        i++
    }


}

fun main() {
    compareArrays()
}