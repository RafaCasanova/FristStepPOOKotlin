class ContaPoupanca (titular: String):Conta(titular = titular) {

    override fun depositar(valor: Double) {
        val valorAd = valor +(valor * 0.01)
        super.depositar(valorAd)
    }
}