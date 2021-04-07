package modelo

import Autenticavel

class Gerente(
    nome: String,
    salario: Double,
    id: Int,
    protected val senha: Int
) : Funcionario(
    nome = nome,
    salario = salario,
    id = id
), Autenticavel {

    override fun bonificacao(): Double = salario * 0.2


    override fun autentica(senha: Int): Boolean = senha == this.senha
}
