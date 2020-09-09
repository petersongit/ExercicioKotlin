
fun main(){
    val atleta1 = Atletas("Peterson", 5, 8)
    val atleta2 = Atletas("João Paulo", 9, 10)

    val provaMatematica = Prova(7, 6)
    val provaPortugues = Prova(5, 4)
    val provaCiencia = Prova(10, 10)


    println(provaMatematica.podeRealizar(atleta1))
    println(provaPortugues.podeRealizar(atleta1))
    println(provaCiencia.podeRealizar(atleta1))

    println("--------------------------------------")

    println(provaMatematica.podeRealizar(atleta2))
    println(provaPortugues.podeRealizar(atleta2))
    println(provaCiencia.podeRealizar(atleta2))


}