
    fun main(){
        val triple =Triple(true, 5,10,8)

        println(triple)
        triple.definirAltura(6)
        triple.desdobrar()
        println(triple)

        triple.prontoParaGuardar()
        triple.guardar()


        println(triple.prontoParaUsar())
    }
