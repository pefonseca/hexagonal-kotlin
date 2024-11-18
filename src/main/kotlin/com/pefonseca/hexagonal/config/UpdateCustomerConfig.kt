package com.pefonseca.hexagonal.config

import com.pefonseca.hexagonal.adapters.out.FindAddressByZipCodeAdapter
import com.pefonseca.hexagonal.adapters.out.SendCpfForValidationAdapter
import com.pefonseca.hexagonal.adapters.out.UpdateCustomerAdapter
import com.pefonseca.hexagonal.application.core.usecase.FindCustomerByIdUseCase
import com.pefonseca.hexagonal.application.core.usecase.UpdateCustomerUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UpdateCustomerConfig {

    @Bean
    fun updateCustomer(
        findCustomerByIdUseCase: FindCustomerByIdUseCase,
        findAddressByZipCodeAdapter: FindAddressByZipCodeAdapter,
        updateCustomerAdapter: UpdateCustomerAdapter,
        sendCpfForValidationAdapter: SendCpfForValidationAdapter
    ) = UpdateCustomerUseCase(
            findCustomerByIdUseCase,
            findAddressByZipCodeAdapter,
            updateCustomerAdapter,
            sendCpfForValidationAdapter
        )
}