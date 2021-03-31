class ContaCorrente(titular: String):Conta(titular = titular) {


    override fun sacar(valor: Double) {
        var valorTarifa = valor + 0.1
        super.sacar(valorTarifa)
    }
}