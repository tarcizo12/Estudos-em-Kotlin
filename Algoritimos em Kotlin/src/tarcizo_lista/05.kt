

package tarcizo_list

private fun prompt(x: String): Int {
    print("Write a value of $x")
    return readLine()?.toInt() ?: 0
}

fun verifTable(age: Int, weigth: Int): Int{

    if(age<20){

        if(weigth<60) return 9
        else if (weigth in 60..90) return 8
        else if(weigth>90) return 7

    }else if(age in 20..50){

        if(weigth<60) return 6
        else if (weigth in 60..90) return 5
        else if(weigth>90) return 4

    }else if(age > 50){

        if(weigth<60) return 3
        else if (weigth in 60..90) return 2
        else if(weigth>90) return 1

    }

    return 0;

}

fun main() {
    val age = prompt(" age")
    val weigth = prompt(" wigth")
    print("Seu grupo de risco é: ${verifTable(age, weigth)}")

}