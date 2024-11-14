package com.pefonseca.hexagonal.application.ports.`in`

import com.pefonseca.hexagonal.application.core.domain.Customer

interface FindCustomerByIdInputPort {

    fun find(id: String): Customer

}