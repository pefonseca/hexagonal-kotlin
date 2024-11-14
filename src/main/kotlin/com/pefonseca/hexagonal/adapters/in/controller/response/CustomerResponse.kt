package com.pefonseca.hexagonal.adapters.`in`.controller.response

import com.pefonseca.hexagonal.application.core.domain.Customer

data class CustomerResponse(
    val id: String,
    val name: String,
    val address: AddressResponse,
    val cpf: String,
    val isValidCpf: Boolean
) {

    constructor(customer: Customer): this(
        // !! garante que o Id não vai ser nulo!
        customer.id!!,
        customer.name,
        AddressResponse(customer.address!!),
        customer.cpf,
        customer.isValidCpf
    )

}