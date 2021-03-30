class Gerente(
    nome: String,
    salario: Double,
    id: Int,
    private val senha: Int
) : Funcionario(
    nome = nome,
    salario = salario,
    id = id
) {

    override fun bonificacao(): Double = salario * 0.2


    fun autenticacao(senha: Int): Boolean = senha == this.senha
}
