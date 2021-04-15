package modelo.bancos




abstract class Conta(var titular: Cliente) {
    companion object Contador{
        var total = 0
            private set
//        companion deixa a classe superior modificar seus atributos caso não esteja private
//        fun incrementa(){
//            total++
//        }
    }
    init {
        total++
//        Contador.incrementa() esta função so e preciso caso o objeto não esteja como companion
    }
    var saldo: Double = 0.00
        protected set
        //get() = "%.2f".format(field).toDouble() porem arredonda e nao devolve o numero com duas casas decimal
        //poderia ser implementado o BigDecimal podem preferi fazer na mão com getSaldo
    open fun getSaldo(): String{
        val saldoString = String.format("%.2f",this.saldo)
            return "${this.titular.nome} seu saldo atual e deR$$saldoString"
    }

    open fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
            val saldoString = String.format("%.2f",this.saldo)
            println("${this.titular.nome},deposito realizado no valor de R$${saldoString} ")
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