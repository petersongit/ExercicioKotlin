fun main(){
    val cliente = Cliente("Peterson", "Coelho")
    val conta = Conta(124, 100.00, cliente)

    println(cliente)
    println(conta)

    conta.deposito(15.0)
    conta.saque(150.0)

}