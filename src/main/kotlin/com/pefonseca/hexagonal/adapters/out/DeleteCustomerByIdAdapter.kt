package com.pefonseca.hexagonal.adapters.out

import com.pefonseca.hexagonal.adapters.out.repository.CustomerRepository
import com.pefonseca.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort
import org.springframework.stereotype.Component

@Component
class DeleteCustomerByIdAdapter(
    private val customerRepository: CustomerRepository
): DeleteCustomerByIdOutputPort {

    override fun delete(id: String) {
        customerRepository.deleteById(id)
    }

}