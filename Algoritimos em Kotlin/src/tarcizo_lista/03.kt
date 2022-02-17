package tarcizo_list

fun prompt() =  readLine()!!.toDouble()


fun salario(Num_Hex: Double, Sm: Double , Num_H: Double): Double {

    //Htb (Hora trabalhada) = Sm*(1/8)
    //Hex (Hora extra) = Sm*(1/4)
    //Sb (Salario Bruto) = Num_H*Htb
    //Qnt_Hex (Quantia a receber pelas horas extras)= Num_Hex*Hex
    //Total = Qnt_Hex + Sb

    var Htb = Sm*0.125
    var Hex = Sm*0.25
    var Sb = Num_H*Htb
    var Qnt_Hex = Num_Hex * Hex
    return Qnt_Hex+Sb
    //* FAZER COMPARAÇÃO COM A QUESTAO 2 (DUVIDA)
}


fun main() {
    print("Digite o valor do Salario minimo")
    val Sm = prompt() // valor do salário minimo
    print("Digite as suas horas trabalhadas")
    val Num_H = prompt() // horas trabalhadas
    print("Digite as horas extras trabalhadas")
    val Num_Hex = prompt() // numero de horas extras

    println(salario(Num_Hex, Sm, Num_H))

}