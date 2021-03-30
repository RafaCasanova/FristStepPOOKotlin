class CalcularBonificacao {
    var totalBonificacao:Double= 0.0
        private set

    fun registra(funcionario: Funcionario){
        this.totalBonificacao += funcionario.bonificacao()
    }

}