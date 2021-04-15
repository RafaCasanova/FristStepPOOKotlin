package teste

import modelo.bancos.Cliente
import modelo.bancos.Conta
import modelo.bancos.ContaCorrente
import modelo.bancos.ContaPoupanca

fun testedecontas(){

    val rafael = Cliente("Rafael",123456)
    val conta = ContaCorrente(rafael,123)
    println(conta.titular.nome)
    conta.depositar(200.0)
    conta.sacar(-100.0)
    println(conta.saldo)

    val polvo = Cliente("Polvo",12345678,)
    val conta1 = ContaPoupanca(polvo,12345678)
    conta.transferir(conta1,100.0)
    println(conta.saldo)
    println(conta1.saldo)


    val araia = ContaPoupanca(Cliente("Araia",1111),1111)


    val lacraia = ContaCorrente(Cliente("Lacraia",222),231)

    araia.depositar(1000.0)
    lacraia.depositar(1000.0)

    araia.sacar(100.0)
    lacraia.sacar(100.0)
    lacraia.transferir(araia, 400.0)

    println(araia.getSaldo())
    println(lacraia.getSaldo())
    println(Conta.total)
}