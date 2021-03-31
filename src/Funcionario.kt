abstract class Funcionario(
    val nome: String,
    val id: Int,
    val salario: Double
) {
    abstract fun bonificacao(): Double

}