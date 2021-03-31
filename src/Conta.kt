abstract class Conta(var titular: String) {


    var saldo = 0.0
        protected set


    open fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
            println("${this.titular},deposito realizado no valor de R$$valor ")
        } else (println("Não foi possivel efetuar a operação"))
    }


    open fun sacar(valor: Double) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor
        } else {
            println("Não foi possivel efetuar a operação")
        }
    }

    fun transferir(destino: Conta, valor: Double) {
        if (this.saldo >= valor) {
            this.sacar(valor)
            destino.depositar(valor)
        }
    }


}