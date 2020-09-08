class Conta(val numeroConta: Int, val saldo: Double, val titular: Cliente) {

    init {
        println("Conta $numeroConta foi criado com sucesso. O saldo é de $saldo.")
    }
    override fun toString(): String {
        return "Conta{NumeroConta: $numeroConta, Saldo: $saldo, Titular: $titular}"
    }
}