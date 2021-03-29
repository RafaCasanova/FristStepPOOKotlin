fun main() {
    println("is it work?")

    val conta = Conta()
    conta.titular = "Rafael"
    println(conta.titular)
    conta.depositar(200.0)
    conta.sacar(-100.0)
    println(conta.getSaldo())

    val conta1 = Conta()
    conta1.titular="Polvo"
    conta.transferir(conta1,100.0)
    println(conta.getSaldo())
    println(conta1.getSaldo())

}
