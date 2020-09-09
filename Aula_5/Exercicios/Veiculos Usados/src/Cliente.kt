class Cliente(val nome: String, val sobreNome: String, val contato: String) {
    override fun toString(): String {
        return "Cliente(nome='$nome', sobreNome='$sobreNome', contato='$contato')"
    }
}