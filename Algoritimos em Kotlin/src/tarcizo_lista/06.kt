package tarcizo_list

private fun prompt(x: String): Int {
    print("Write a value of $x")
    return readLine()!!.toInt()
}

fun returnPrice(value: Int): Number {
    val price = when(value){
        in 1..10-> 10.0
        in 11..20-> 15.0
        in 21..30-> 20.0
        in 31..40-> 30.0
        else -> {0}
    }

    return price
}

fun checkDiscount(price: Double): Double{

    val discount = when{
        price < 250 -> 0.05
        price in 250.0..500.0-> 0.1
        price > 500 -> 0.15
        else -> {0.0}
    }

    return discount
}

fun main() {
    val code = prompt(" code ")
    val quantityPurchased = prompt(" quantidade ")
    val totalPrice = quantityPurchased *( returnPrice(code) as Double)

    println("O valor unitário deste produto é de ${returnPrice(code)} R$")
    println("O preço total fica de $totalPrice R$")
    println("Teve um desconto de ${totalPrice* checkDiscount(totalPrice)} R$")
    println("Preço final: ${ totalPrice-(totalPrice* checkDiscount(totalPrice))}")


}
