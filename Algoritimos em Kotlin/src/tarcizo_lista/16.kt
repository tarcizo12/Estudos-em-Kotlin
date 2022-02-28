package tarcizo_list

private fun promptInt(message: String): Int {
    print(message)
    return readLine()!!.toInt()
}

fun biggestAndSmaler(): String{
    var bigger = Int.MIN_VALUE
    var smaller = Int.MAX_VALUE
    val array = IntArray(5)

    for(i in array.indices) array[i] = promptInt("Digite o numero ")
    for(i in array.indices)
    {
        if(array[i] > bigger) bigger = array[i]
        else if(array[i] < smaller) smaller = array[i]
    }
    return "O valor do maior é: $bigger , e o do menor é: $smaller"
}

fun main() {
    print(biggestAndSmaler())
}