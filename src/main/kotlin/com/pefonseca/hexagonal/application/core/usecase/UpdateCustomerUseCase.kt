package com.pefonseca.hexagonal.application.core.usecase

import com.pefonseca.hexagonal.application.core.domain.Customer
import com.pefonseca.hexagonal.application.ports.`in`.FindCustomerByIdInputPort
import com.pefonseca.hexagonal.application.ports.`in`.UpdateCustomerInputPort
import com.pefonseca.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort
import com.pefonseca.hexagonal.application.ports.out.UpdateCustomerOutputPort

class UpdateCustomerUseCase(
    private val findCustomerByIdInputPort: FindCustomerByIdInputPort,
    private val findAddressByZipCodeOutputPort: FindAddressByZipCodeOutputPort,
    private val updateCustomerOutputPort: UpdateCustomerOutputPort
): UpdateCustomerInputPort {

    override fun update(customer: Customer, zipCode: String) {
        if (customer.id == null) throw IllegalArgumentException("The id field cannot be null")
        findCustomerByIdInputPort.find(customer.id)

        customer.apply {
            address = findAddressByZipCodeOutputPort.find(zipCode)
        }.let {
            updateCustomerOutputPort.update(it)
        }
    }

}