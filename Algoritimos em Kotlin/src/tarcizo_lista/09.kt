package tarcizo_list
private fun promptInt(value: String): Int {
    print(value)
    return readLine()!!.toInt()
}

fun calculateMedia(): Double{
    var sum=0;
    var cont=0

    while(true){

        val age = promptInt("Digite a idade ")
        if(age<=0) break

        val heigth = promptInt("Digite a altura ")
        if(age >= 50 ) {
            sum+= heigth
            cont+=1
        }


    }
    return ( sum/cont ).toDouble()
}

fun main() {
    print("A média das alturas é de: ${calculateMedia()}m")
}