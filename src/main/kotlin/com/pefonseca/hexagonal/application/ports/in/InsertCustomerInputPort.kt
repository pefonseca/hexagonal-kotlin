package com.pefonseca.hexagonal.application.ports.`in`

import com.pefonseca.hexagonal.application.core.domain.Customer

interface InsertCustomerInputPort {

    fun insert(customer: Customer, zipCode: String)

}