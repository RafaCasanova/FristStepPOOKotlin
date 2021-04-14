package modelo.funcionarios

import modelo.funcionarios.Funcionario

class Analista(
    nome: String,
    id: Int,
    salario: Double
) : Funcionario(
    nome = nome,
    id = id,
    salario = salario
){
    override fun bonificacao(): Double = salario * 0.15

}
