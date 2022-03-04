package tarcizo_list

private fun promptInt(message: String): Int {
    print(message)
    return readLine()!!.toInt()
}

fun verifyInvested(investimentCode: Int,investiment: Int): Double {
    val income = when(investimentCode){
        1 -> 0.015
        2 -> 0.02
        else -> 0.04
    }

    return investiment*income

}

fun main() {
    val codeClient = promptInt("Digite o código de acordo com a opção de investimento\n" +
                                "1 - Poupança \n" +
                                "2 - Poupança Pus \n" +
                                "3 - Fundo de renda fixa ")

    val investedAmount = promptInt("Digite o valor investido: ")

    print("O valor investido de $investedAmount gera ${verifyInvested(codeClient, investedAmount)}R$ ao mês")

}