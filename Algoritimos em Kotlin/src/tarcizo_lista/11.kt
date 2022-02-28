package tarcizo_list

private fun promptString(message: String): String {
    print(message)
    return readLine()!!.toString()
}

fun verifyNumbers(): String {

    var bigger = 0
    var smaller = 999999

    while(true){
        //key to stop = stop
        val number = promptString("Digite o numero ")

        if(number== "stop") break
        else{
            val numberInt = number.toInt()

            if(numberInt < 0) println("Numero Invalido, digite novamente")
            else if(numberInt > bigger) bigger = numberInt
            else if(numberInt < smaller) smaller = numberInt


        }
    }

    return "O maior numero é ${bigger} e o menor é o ${smaller}"
}

fun main() {
    print(verifyNumbers())
}