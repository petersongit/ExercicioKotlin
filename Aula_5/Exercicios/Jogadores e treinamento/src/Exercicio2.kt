
    fun main(){
        val jogador1 = JogadorDeFutebol("Peteson", 8, 7,10,7)
        val jogador2 = JogadorDeFutebol("João Paulo", 8, 9,5,10)

        val treinamento = SessaoDeTreinamento()

        treinamento.TreinarA(jogador1)
        treinamento.TreinarA(jogador2)

    }
