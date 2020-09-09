class Prova(val dificuldade: Int, val energiaNecessaria: Int) {

    override fun toString(): String {
        return "Prova(dificuldade=$dificuldade, energiaNecessaria=$energiaNecessaria)"
    }

    fun podeRealizar(atleta: Atletas): Boolean{
        return atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria
    }


}