package tarcizo_lista
fun convert(M: Double,D: Double): Double {

    val money = when {
        M == 1.0 -> D * 1.80;
        M == 2.0 -> D * 2.0;
        M == 3.0 -> D * 3.57
        else -> {
            "Número inválido"
        }

    }

    return money as Double;
}

fun prompt(): Double {

    return readLine()!!.toDouble() ?: 0.0;
    println();
}


fun main() {
    print("Digite para qual moeda você deseja converter (1:Dólar, 2:Marco Alemão,3:Libra Esterlina) ")
    val M = prompt(); // moeda desejada para conversão
    print("Digite quanto você tem em reais ")
    val D = prompt(); // dinheiro em reais que uma pessoa que vai viajar possui
    print("Se você tem $D reais, convertendo vai ter ${convert(M,D)}")

}