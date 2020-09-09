class Conta(val numeroConta: Int, var saldo: Double, val titular: Cliente) {

    override fun toString(): String {
        return "Conta(numeroConta=$numeroConta, saldo=$saldo, titular=$titular)"
    }


    init {
        println("Conta $numeroConta foi criado com sucesso. O saldo é de $saldo.")
    }

    fun deposito(valor: Double){
        saldo += valor
        println("---- TRANSAÇÃO - DEPÓSITO ---")
        println("Saldo atualizado: $saldo")
    }

    fun saque(valor: Double){
        println("---- TRANSAÇÃO - SAQUE ---")

        if (valor >= saldo){
            println("Saldo insuficiente: $saldo")
        } else {
            saldo -= valor
            println("saldo atualizado: $saldo")
        }

    }


}