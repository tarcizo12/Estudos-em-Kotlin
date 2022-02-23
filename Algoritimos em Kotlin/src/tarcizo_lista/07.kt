
private fun promptInt(value: String): Int {
    print(value)
    return readLine()!!.toInt()
}

private fun promptString(value: String): String {
    print(value)
    return readLine().toString()
}

fun calculateTax(category: Int, situation: String): Double {
    var tax= 1.0

    if((category == 2) || situation == "R") tax = 0.05
    else tax = 0.08

    return tax
}

fun calculateIncrease(category: Int, price: Int): Double {
    var increase: Double;

    if (price<=25){
        increase =  when(category){
            1 -> 0.05
            2 -> 0.08
            3 -> 0.1
            else -> 0.0
        }
        return increase

    }else if(price>=25){
        increase = when(category){
            1 -> 0.12
            2 -> 0.15
            3 -> 0.18
            else -> 0.0
        }
        return increase
    }
    return 0.0
}

fun calculateNewPrice(price: Int, category: Int, situation: String) = price + (price*calculateIncrease(category,price) - (price*calculateTax(category,situation)))

fun main() {
    val price = promptInt(" Digite o preço ")
    val category = promptInt(" Digite a categoria ") // (1 - Limpeza; 2 - Alimentação; ou 3 - Vestuário)
    val situation = promptString(" Digite a situação ") // R ou N
    val newPrice = calculateNewPrice(price,category,situation)
    val classification = when{
        newPrice <=50 -> "Barato"
        newPrice >= 120 -> "Caro"
        else -> {"Normal"}
    }

    print("O novo preço de $newPrice R$ é $classification")



}