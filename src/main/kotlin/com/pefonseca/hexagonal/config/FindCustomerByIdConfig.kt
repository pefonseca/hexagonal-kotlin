package com.pefonseca.hexagonal.config

import com.pefonseca.hexagonal.adapters.out.FindCustomerByIdAdapter
import com.pefonseca.hexagonal.application.core.usecase.FindCustomerByIdUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FindCustomerByIdConfig {

    @Bean
    fun findCustomerById(findCustomerByIdAdapter: FindCustomerByIdAdapter) =
        FindCustomerByIdUseCase(findCustomerByIdAdapter)

}