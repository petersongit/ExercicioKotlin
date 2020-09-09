class Triple(var dobrado: Boolean, val alturaMinima: Int, var alturaMaxima: Int, var alturaAtual: Int){
    override fun toString(): String {
        return "Triple(dobrado=$dobrado, alturaMinima=$alturaMinima, alturaMaxima=$alturaMaxima, alturaAtual=$alturaAtual)"
    }

    fun definirAltura(novaAltura: Int){
        if (novaAltura < alturaMinima){
            println("A altura informa é muito pequena, a altura minima permitida para este Tripé é de $alturaMinima")
        } else {
            alturaAtual = novaAltura
        }

    }

    fun dobrar(){
        dobrado = true
    }

    fun desdobrar(){
        dobrado = false
    }

    fun guardar() {
        if (prontoParaGuardar() == true) {
            println("Tripé foi guardado com segurança")
        }else{
            println("Tripé não foi guardado. Para ser guardado ele precisa estar como dobrado e esta na altura munima que é de $alturaMinima")
        }
    }

    fun prontoParaGuardar(): Boolean{
        return dobrado && (alturaAtual == alturaMinima)
    }

    fun usar(): Boolean{
        return prontoParaUsar()
    }

    fun prontoParaUsar(): Boolean{
        return !dobrado  && (alturaAtual >= (alturaMaxima / 2))
    }


}