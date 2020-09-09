class Veiculo(val marca: String, val modelo: String, val anoFabricacao: Int, val cor: String, val quilometragem: Int) {
    override fun toString(): String {
        return "Veiculo(marca='$marca', modelo='$modelo', anoFabricacao=$anoFabricacao, cor='$cor', quilometragem=$quilometragem)"
    }
}