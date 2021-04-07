package teste

import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testedecontas(){
    val conta = ContaCorrente("Rafael",111)
    println(conta.titular)
    conta.depositar(200.0)
    conta.sacar(-100.0)
    println(conta.saldo)

    val conta1 = ContaPoupanca("Polvo",12345678)
    conta.transferir(conta1,100.0)
    println(conta.saldo)
    println(conta1.saldo)
    val araia = ContaPoupanca("Araia",112)
    val lacraia = ContaCorrente("Lacraia",231)

    araia.depositar(1000.0)
    lacraia.depositar(1000.0)

    araia.sacar(100.0)
    lacraia.sacar(100.0)
    lacraia.transferir(araia, 400.0)

    println(araia.saldo)
    println(lacraia.saldo)
}