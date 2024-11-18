package com.pefonseca.hexagonal.application.ports.out

interface SendCpfForValidationOutputPort {

    fun send(cpf: String)

}