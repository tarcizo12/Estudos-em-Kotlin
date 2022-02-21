package tarcizo_list

private fun prompt(x: String): Int {
    print(x)
    return readLine()!!.toInt()
}

fun optionOne(): Int {
    val wage = prompt("Digite o seu salário ")
    println("Seu salário é de: $wage R$")
    return wage;
}

fun optionTwo(): Double {
    val vocation = optionOne() *1.33
    println("Valor das suas férias: $vocation R$")
    return vocation
}

fun optionThree(): Double {
    val wage= optionOne()

    var numberOfMonths =prompt("Digite quantos meses você trabalhou ")
    return if (numberOfMonths > 12) {
        println("Valor invalido")
        optionThree()
    } else {
        val newWage = (wage * (numberOfMonths / 12.0))
        print("Seu decimo terceiro é de $newWage R$")
        return newWage
    }

}

fun optionFour() = print("Menu fechado")

fun verifyOption(number: Int): Any {
    val runOption = when(number){
        1 -> optionOne()
        2 -> optionTwo()
        3 -> optionThree()
        4 -> optionFour()
        else -> {
            println("Opção Invalida")
            verifyOption( prompt("1 - Novo Salário\n2 - Férias\n3 - Décimo terceiro \n4 - Sair ") )
        }
    }

    return runOption
}

fun main() {

    println("Menu de opções:")
    verifyOption( prompt("1 - Novo Salário\n2 - Férias\n3 - Décimo terceiro \n4 - Sair ") )


}