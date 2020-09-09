fun main(){
    val clientePeterson = Cliente("Peterson", "Coelho", "11984161617")
    val carroPalio = Veiculo("Fiat", "Palio", 2010, "Azul", 150741)
    val venda = Venda(clientePeterson, carroPalio, 15000)
    val concessionaria = Concessionaria()

    concessionaria.registrarVenda(venda)


}