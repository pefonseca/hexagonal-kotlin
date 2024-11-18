package com.pefonseca.hexagonal.adapters.out

import com.pefonseca.hexagonal.application.ports.out.SendCpfForValidationOutputPort
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class SendCpfForValidationAdapter(
    private val kafkaTemplate: KafkaTemplate<String, String>
): SendCpfForValidationOutputPort {

    override fun send(cpf: String) {
        kafkaTemplate.send("tp-cpf-validation", cpf)
    }

}