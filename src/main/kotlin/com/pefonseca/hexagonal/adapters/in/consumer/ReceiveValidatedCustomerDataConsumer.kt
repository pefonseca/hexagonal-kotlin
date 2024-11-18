package com.pefonseca.hexagonal.adapters.`in`.consumer

import com.pefonseca.hexagonal.adapters.`in`.consumer.message.CustomerMessage
import com.pefonseca.hexagonal.application.ports.`in`.UpdateCustomerInputPort
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class ReceiveValidatedCustomerDataConsumer(
    private val updateCustomerInputPort: UpdateCustomerInputPort
) {

    @KafkaListener(topics = ["tp-cpf-validated"])
    fun receive(customerMessage: CustomerMessage) {
        with(customerMessage) {
            updateCustomerInputPort.update(toCustomer(), zipCode)
        }
    }

}