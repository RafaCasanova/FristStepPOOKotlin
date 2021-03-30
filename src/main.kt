fun main() {
    println("is it work?")
    testeDeComportamento()

}

fun testeDeComportamento() {
//    val conta = Conta("Rafael")
//    println(conta.titular)
//    conta.depositar(200.0)
//    conta.sacar(-100.0)
//    println(conta.getSaldo())
//
//    val conta1 = Conta("Polvo")
//    conta.transferir(conta1,100.0)
//    println(conta.getSaldo())
//    println(conta1.getSaldo())

    val rafael = Funcionario("Rafael", 123456, 1500.0)

    println(rafael.bonificacao())
    val seila = Gerente("Polvo", 4500.0, 12345, 1234)

    println(seila.autenticacao(124))
}
