class Conta {
    var titular = ""
    val numeroDaConta = 0
    private var saldo = 0.0


    fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
            println("${this.titular},deposito realizado no valor de R$$valor ")
        } else (println("Não foi possivel efetuar a operação"))
    }

    fun sacar(valor: Double) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor
        }else{
            println("Não foi possivel efetuar a operação")
        }
    }

    fun transferir(destino: Conta, valor: Double) {
        if (this.saldo >= valor) {
            this.sacar(valor)
            destino.depositar(valor)
        }
    }

    fun getSaldo():Double{
        return this.saldo
    }
}