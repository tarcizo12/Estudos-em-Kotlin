package tarcizo_list

private fun promptInt(message: String): Int {
    print(message)
    return readLine()!!.toInt()
}

fun positiveArray(){
    val array = IntArray(3)
    
    for(i in array.indices){
        array[i] = promptInt("Digite o numero ")
    }

    print("Os elementos positivos do array são: ")
    array.forEach{
        if(it>0) print("$it ")
    }


}

fun main() {
    positiveArray()
}