package modelo.bancos

import modelo.Endereco


class Cliente(val nome: String, val cpf:Int, var endereco : Endereco = Endereco())