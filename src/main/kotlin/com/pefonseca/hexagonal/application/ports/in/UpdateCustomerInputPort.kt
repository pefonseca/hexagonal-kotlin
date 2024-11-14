package com.pefonseca.hexagonal.application.ports.`in`

import com.pefonseca.hexagonal.application.core.domain.Customer

interface UpdateCustomerInputPort {

    fun update(customer: Customer, zipCode: String)

}