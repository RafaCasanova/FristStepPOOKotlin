fun main() {
    println("is it work?")
    testeDeComportamento()

}

fun testeDeComportamento() {
    val conta = Conta("Rafael")
    println(conta.titular)
    conta.depositar(200.0)
    conta.sacar(-100.0)
    println(conta.saldo)

    val conta1 = Conta("Polvo")
    conta.transferir(conta1,100.0)
    println(conta.saldo)
    println(conta1.saldo)

    val rafael = Funcionario("Rafael", 123456, 1500.0)

    println(rafael.bonificacao())
    val molusco = Gerente("Polvo", 4500.0, 12345, 1234)

    println(molusco.autenticacao(124))

    val calcularFuncionario = CalcularBonificacao()

    calcularFuncionario.registra(rafael)
    calcularFuncionario.registra(molusco)
    println(calcularFuncionario.totalBonificacao)

    val araia = ContaPoupanca("Araia")
    val lacraia = ContaCorrente("Lacraia")

    araia.depositar(1000.0)
    lacraia.depositar(1000.0)

    araia.sacar(100.0)
    lacraia.sacar(100.0)
    lacraia.transferir(araia, 100.0)

    println(araia.saldo)
    println(lacraia.saldo)


}
