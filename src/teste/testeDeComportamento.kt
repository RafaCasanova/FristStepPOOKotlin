package teste

import modelo.funcionarios.Analista
import modelo.funcionarios.CalcularBonificacao
import modelo.funcionarios.Gerente

fun testeDeComportamento(){


        val siri = Analista("Siri",111,2500.0)

        println(siri.bonificacao())
        val molusco = Gerente("Polvo", 4500.0, 12345, 1234)

        println(molusco.autentica(124))

        val calcularFuncionario = CalcularBonificacao()

        calcularFuncionario.registra(siri)
        calcularFuncionario.registra(molusco)
        println(calcularFuncionario.totalBonificacao)


}

