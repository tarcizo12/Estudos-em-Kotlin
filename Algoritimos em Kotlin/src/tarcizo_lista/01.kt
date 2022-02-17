package tarcizo_list

fun diagonal(N: Int) = ( N*(N-3) )/2;

fun main() {
    println("Digite o numero de lados")
    val N = readLine()!!.toInt() ?: 0 ;
    print("O numero de diagonais é: ${diagonal(N)} ");
}