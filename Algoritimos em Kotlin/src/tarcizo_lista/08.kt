package tarcizo_list

private fun promptInt(value: String): Int {
    print(value)
    return readLine()!!.toInt()
}

fun verifyTable(hours: Double): Double {
    val hoursInMinute =  hours*60

    val award = when{
        hoursInMinute>=2400 -> 500
        hoursInMinute.toInt() in 1800 until 2400 -> 400
        hoursInMinute.toInt() in 1200 until 1800 -> 300
        hoursInMinute.toInt() in 600 until 1200 -> 200
        else -> {100}
    }

    return award.toDouble()
}

fun main() {
    val extraHours = promptInt("Numero de horas extras: ")
    val missingHours = promptInt("Numero de horas faltadas: ")
    val H = (extraHours) - (0.66*missingHours)

    println("Seu premio é de ${verifyTable(H)}")
}
