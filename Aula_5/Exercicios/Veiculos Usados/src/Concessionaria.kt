class Concessionaria {

    fun registrarVenda(venda: Venda){
        println("Venda registrada com sucesso do veiculo ${venda.veiculo.modelo} para o cliente ${venda.cliente.nome} no valor de ${venda.valorVenda}.")
    }
}