package tarcizo_list

private fun promptInt(message: String): Int {
    print(message)
    return readLine()!!.toInt()
}

fun multiplyDiagonalIndex(arrayMatrix: Array<IntArray>): Array<IntArray> {
    val diagonalIndices = mutableListOf<Int>()
    val rows = arrayMatrix.size
    val columns = arrayMatrix[0].size

    for(i in 0 until rows){
        for(j in 0 until columns){
            if(i==j) diagonalIndices.add(arrayMatrix[i][j])
        }
    }

    for(i in 0 until rows){
        for(j in 0 until columns){
            arrayMatrix[i][j]  *= diagonalIndices[i]
        }
    }


    return arrayMatrix
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

private fun printMatrix(arrayMatrix: Array<IntArray>){
    val rows = arrayMatrix.size
    val columns = arrayMatrix[0].size

    for(i in 0 until rows ){
        for(j in 0 until columns){
            print("${arrayMatrix[i][j]} ")
        }
        println()
    }
    println()
}

fun main() {

    val columns = 3
    val rows = 3
    var matrix = createMatrix(rows, columns)

    println("Sua matriz inicial é: ")
    printMatrix(matrix)

    matrix = multiplyDiagonalIndex(matrix)

    println("Sua nova matriz é: ")
    printMatrix(matrix)



}