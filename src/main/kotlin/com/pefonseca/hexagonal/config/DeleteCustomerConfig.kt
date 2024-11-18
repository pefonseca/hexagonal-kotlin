package com.pefonseca.hexagonal.config

import com.pefonseca.hexagonal.adapters.out.DeleteCustomerByIdAdapter
import com.pefonseca.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase
import com.pefonseca.hexagonal.application.core.usecase.FindCustomerByIdUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DeleteCustomerConfig {

    @Bean
    fun deleteCustomer(
        findCustomerByIdUseCase: FindCustomerByIdUseCase,
        deleteCustomerByIdAdapter: DeleteCustomerByIdAdapter
    ) = DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter)

}