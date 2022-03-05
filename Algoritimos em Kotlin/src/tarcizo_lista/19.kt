package tarcizo_list

private fun promptInt(message: String): Int {
    print(message)
    return readLine()!!.toInt()
}

private fun createMatrix(rows: Int, columns: Int): Array<IntArray> {

    val matrix = Array(rows){ IntArray(columns )}

    for(i in 0 until rows){
        for(j in 0 until columns){
            matrix[i][j] = promptInt("Digite o elemento no indicie m[$i][$j]")
        }
    }

    return matrix
}

fun matrixAverage(arrayNumber: Array<IntArray>): Double{
    val rows = arrayNumber.size
    val columns = arrayNumber[0].size
    var averageOfElements = 0.0
    val elementsTotal = rows * columns

    for(i in 0 until rows) for(j in 0 until columns){
        averageOfElements += arrayNumber[i][j]
    }



    return (averageOfElements/elementsTotal)
}

fun numberOfEvenElements(arrayNumber: Array<IntArray>): Int{
    val rows = arrayNumber.size
    val columns = arrayNumber[0].size
    var numberOfElements = 0

    for(i in 0 until rows){
        for(j in 0 until columns){
            if (arrayNumber[i][j] %2 == 0) numberOfElements ++
        }
    }

    return numberOfElements
}

fun numberOfOddElements(arrayNumber: Array<IntArray>): Int{
    val rows = arrayNumber.size
    val columns = arrayNumber[0].size
    var sumOfElements = 0

    for(i in 0 until rows){
        for(j in 0 until columns){
            if (arrayNumber[i][j] %2 != 0) sumOfElements += arrayNumber[i][j]
        }
    }

    return sumOfElements
}

fun main() {
    val matrix = createMatrix(3,4)

    println("Existem ${numberOfEvenElements(matrix)} pares nessa matriz")
    println("A soma dos elementos ímpares é de: ${numberOfOddElements(matrix)}")
    println("A média da matriz é: ${matrixAverage(matrix)}")


}