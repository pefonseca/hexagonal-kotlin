package com.pefonseca.hexagonal.application.core.usecase

import com.pefonseca.hexagonal.application.core.domain.Customer
import com.pefonseca.hexagonal.application.ports.`in`.InsertCustomerInputPort
import com.pefonseca.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort
import com.pefonseca.hexagonal.application.ports.out.InsertCustomerOutputPort
import com.pefonseca.hexagonal.application.ports.out.SendCpfForValidationOutputPort

class InsertCustomerUseCase(
    private val findAddressByZipCodeOutputPort: FindAddressByZipCodeOutputPort,
    private val insertCustomerOutputPort: InsertCustomerOutputPort,
    private val sendCpfForValidationOutputPort: SendCpfForValidationOutputPort
): InsertCustomerInputPort {

    override fun insert(customer: Customer, zipCode: String) {
        customer.apply {
            address = findAddressByZipCodeOutputPort.find(zipCode)
        }.let {
            insertCustomerOutputPort.insert(it)
            sendCpfForValidationOutputPort.send(it.cpf)
        }
    }

}