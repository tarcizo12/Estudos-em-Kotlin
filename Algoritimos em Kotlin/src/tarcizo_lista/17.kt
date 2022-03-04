package tarcizo_list

private fun promptInt(message: String): Int {
    print(message)
    return readLine()!!.toInt()
}

private fun promptString(message: String): String {
    print(message)
    return readLine()!!.toString()
}

fun howManyProducs(array: MutableList<Int>): Int{
    var theAmount = 0

    repeat(array.filter{it < 50}.size) {
        theAmount++
    }

    return theAmount
}

fun productsInRange(arrayPrice: MutableList<Int>, arrayProduct: MutableList<String>): String {
    val products = mutableListOf<String>()

    arrayPrice.filter{it in 50..100}.forEach{

        products.add(arrayProduct[arrayPrice.indexOf(it)])

    }

    return products.toString()
}

fun overHundred(arrayPrice: MutableList<Int>): Double{
    val pricesOverHundre = mutableListOf<Int>()

    arrayPrice.forEach{
        if(it>100){
            pricesOverHundre.add(it)
        }
    }

    val average = pricesOverHundre.average()
    return average
}

fun main() {
        val products = mutableListOf<String>()
        val prices = mutableListOf<Int>()

        for (i in 0 until 3){
            products.add(promptString("Digite o nome do produto ${i+1} "))
            prices.add(promptInt("Digite o valor desse produto ${i+1} "))

        }

    println("A quantidade de produtos com preços inferior a R$50,00 ${howManyProducs(prices)}: ")
    println("O nome dos produtos com preço entre R$ 50,00 e R$ 100,00 são: ${productsInRange(prices,products)}")
    println("a média dos preços dos produtos com preço superior a R$ 100,00 é de: ${overHundred(prices)}")



}