package com.pefonseca.hexagonal.application.ports.out

import com.pefonseca.hexagonal.application.core.domain.Customer

interface UpdateCustomerOutputPort {

    fun update(customer: Customer)

}