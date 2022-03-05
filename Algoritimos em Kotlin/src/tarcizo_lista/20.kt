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

fun sumOfColumns(array: Array<IntArray>): String {
    val rows = array.size
    val columns = array[0].size
    var sumColumns = 0
    val arrayOfSum = mutableListOf<Int>()


    for(i in 0 until columns){ for(j in 0 until rows){
            sumColumns += array[j][i]
        }
        if(sumColumns>10) arrayOfSum.add(sumColumns)
        sumColumns = 0
    }

    if (arrayOfSum.size>0)return arrayOfSum.toString()
    else return " !!Sem colunas com as somas maiores que 10!!"

}


fun main() {
    val matrix = createMatrix(2,3 )

    printMatrix(matrix)
    print("A soma das colunas de soma maiores 10 são: ${sumOfColumns(matrix)}")
}