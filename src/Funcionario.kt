open class Funcionario(val nome: String, val id: Int, val salario: Double) {

    open fun bonificacao(): Double = salario * 0.1


}