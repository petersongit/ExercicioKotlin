package br.digital.com.aulakotlinsemobjeto

fun main(){
    println("Questão: 01: " + maiorDeTres(5,10,7))
    println("Questão: 02: " + comparaString("rua", "cidade"))
    println("Questão: 03: " + EPar(15))

    println("Questão: 04:")
        imprimirCemNumerosPositivosImpares()

    println("Questão: 05:")
        maior(10, 5, 7, 9)

    println("Questão: 06:")
        imprimirCemNumerosPositivos()



}


//Questão: 01
fun maiorDeTres(num1: Int, num2: Int, num3: Int) :Int{
    return maxOf(num1, num2, num3)
}


//Questão: 02
fun comparaString(texto1: String, texto2: String) :Boolean {
    return texto1 != texto2
}

//Questão: 03
fun EPar(num: Int) :Boolean{
    return (num % 2) == 0
}

//Questão: 04
fun imprimirCemNumerosPositivosImpares(){
    for (x in 1.. 200 step 2)  {
        println(x)
    }

}

//Questão: 05
fun maior(numA: Int, numB: Int, numC: Int, numD: Int) :Boolean {
    /*if (((numA > numC) && (numA > numD)) || ((numB > numC) && (numB > numD))){
        return true
    }*/
    
    return (((numA > numC) && (numA > numD)) || ((numB > numC) && (numB > numD)))
}

//Questão: 06
fun imprimirCemNumerosPositivos(){
    for (x in 1.. 100)  {
        println(x)
    }
}

