class Cliente(val nome: String, val sobreNome: String) {

    init {
        println("Cliente $nome foi criado com sucesso!!!");
    }

    override fun toString(): String {
        return "Cliente(nome='$nome', sobreNome='$sobreNome')"
    }


}