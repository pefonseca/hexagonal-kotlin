package com.pefonseca.hexagonal.adapters.out

import com.pefonseca.hexagonal.adapters.out.repository.CustomerRepository
import com.pefonseca.hexagonal.adapters.out.repository.entity.CustomerEntity
import com.pefonseca.hexagonal.application.core.domain.Customer
import com.pefonseca.hexagonal.application.ports.out.InsertCustomerOutputPort
import org.springframework.stereotype.Component

@Component
class InsertCustomerAdapter(
    private val customerRepository: CustomerRepository
): InsertCustomerOutputPort {

    override fun insert(customer: Customer) {
        customerRepository.save(CustomerEntity(customer))
    }

}