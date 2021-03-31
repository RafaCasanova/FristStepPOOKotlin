fun main() {
    println("is it work?")
    testeDeComportamento()

}

fun testeDeComportamento() {
    val conta = ContaCorrente("Rafael")
    println(conta.titular)
    conta.depositar(200.0)
    conta.sacar(-100.0)
    println(conta.saldo)

    val conta1 = ContaPoupanca("Polvo")
    conta.transferir(conta1,100.0)
    println(conta.saldo)
    println(conta1.saldo)

    val siri = Analista("Siri",111,2500.0)

    println(siri.bonificacao())
    val molusco = Gerente("Polvo", 4500.0, 12345, 1234)

    println(molusco.autenticacao(124))

    val calcularFuncionario = CalcularBonificacao()

    calcularFuncionario.registra(siri)
    calcularFuncionario.registra(molusco)
    println(calcularFuncionario.totalBonificacao)

    val araia = ContaPoupanca("Araia")
    val lacraia = ContaCorrente("Lacraia")

    araia.depositar(1000.0)
    lacraia.depositar(1000.0)

    araia.sacar(100.0)
    lacraia.sacar(100.0)
    lacraia.transferir(araia, 400.0)

    println(araia.saldo)
    println(lacraia.saldo)


}
