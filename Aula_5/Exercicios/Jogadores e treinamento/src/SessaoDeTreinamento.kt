class SessaoDeTreinamento() {

    override fun toString(): String {
        return "SessaoDeTreinamento()"
    }
    
    fun TreinarA(jogador: JogadorDeFutebol){
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        jogador.experiencia += 1

        println("A experiecia anterior do jogador ${jogador.nome} era ${jogador.experiencia-1}")
        println("A nova experiecia do jogador ${jogador.nome} é ${jogador.experiencia}")
    }



}
