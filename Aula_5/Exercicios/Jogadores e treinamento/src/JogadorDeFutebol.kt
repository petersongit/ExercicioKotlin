class JogadorDeFutebol(val nome: String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int) {

    override fun toString(): String {
        return "JogadorDeFutebol(nome='$nome', energia=$energia, alegria=$alegria, gols=$gols, experiencia=$experiencia)"
    }

    fun fazerGol(){
        energia -= 5
        alegria += 10
        gols += 1
        println("“GOOOOL!!!")
    }

    fun correr(){
        energia -= 10
        println("Cansei")
    }



}