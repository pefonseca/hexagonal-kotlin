package com.pefonseca.hexagonal.adapters.out

import com.pefonseca.hexagonal.adapters.out.repository.CustomerRepository
import com.pefonseca.hexagonal.adapters.out.repository.entity.CustomerEntity
import com.pefonseca.hexagonal.application.core.domain.Customer
import com.pefonseca.hexagonal.application.ports.out.UpdateCustomerOutputPort
import org.springframework.stereotype.Component

@Component
class UpdateCustomerAdapter(
    private val customerRepository: CustomerRepository
): UpdateCustomerOutputPort {

    override fun update(customer: Customer) {
        customerRepository.save(CustomerEntity(customer))
    }

}