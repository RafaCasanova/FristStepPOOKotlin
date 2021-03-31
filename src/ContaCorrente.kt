class ContaCorrente(titular: String, override val senha: Int):Conta(titular = titular),Autenticavel{

    override fun autentica(senha: Int): Boolean = this.senha == senha
    override fun sacar(valor: Double) {
        var valorTarifa = valor + 0.1
        super.sacar(valorTarifa)
    }
}