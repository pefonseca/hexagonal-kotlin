package com.pefonseca.hexagonal.application.core.usecase

import com.pefonseca.hexagonal.application.core.domain.Customer
import com.pefonseca.hexagonal.application.core.exceptions.ObjectNotFoundException
import com.pefonseca.hexagonal.application.ports.`in`.FindCustomerByIdInputPort
import com.pefonseca.hexagonal.application.ports.out.FindCustomerByIdOutputPort

class FindCustomerByIdUseCase(
    private val findCustomerByIdOutputPort: FindCustomerByIdOutputPort
): FindCustomerByIdInputPort {

    // ?: se não encontrar o objeto procurado lança uma exception!
    override fun find(id: String) = findCustomerByIdOutputPort.find(id) ?: throw ObjectNotFoundException("Customer not found")

}