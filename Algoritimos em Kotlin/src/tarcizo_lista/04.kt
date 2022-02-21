package tarcizo_list
private fun prompt(x: String): Double {
     print("Write a value of $x")
     val variable = readLine()?.toDouble() ?: 0
     return variable as Double
 }

fun main() {
    val hoursTotal = prompt(" hours")
    val minParcial = prompt(" min")
    val minTotal = hoursTotal * 60
    println("Horas convertidas em minutos: $minTotal")
    println("Tempo total em minutos: ${minTotal+minParcial}")
    println("Tempo total em segundos: ${(minTotal+minParcial)*60}")



}