package com.pefonseca.hexagonal.config

import com.pefonseca.hexagonal.adapters.out.FindAddressByZipCodeAdapter
import com.pefonseca.hexagonal.adapters.out.InsertCustomerAdapter
import com.pefonseca.hexagonal.application.core.usecase.InsertCustomerUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InsertCustomerConfig {

    @Bean
    fun insertCustomer(
        findAddressByZipCodeAdapter: FindAddressByZipCodeAdapter,
        insertCustomerAdapter: InsertCustomerAdapter
    ) = InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter)
}