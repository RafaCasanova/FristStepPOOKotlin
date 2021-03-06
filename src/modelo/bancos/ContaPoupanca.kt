package modelo.bancos

import Autenticavel


class ContaPoupanca (titular: Cliente, protected val senha: Int): Conta(titular = titular), Autenticavel {
    override fun depositar(valor: Double) {
        val valorAd = valor +(valor * 0.01)
        super.depositar(valorAd)
    }

    override fun autentica(senha: Int): Boolean = this.senha == senha
}