package com.pefonseca.hexagonal.adapters.out

import com.pefonseca.hexagonal.adapters.out.client.FindAddressByZipCodeClient
import com.pefonseca.hexagonal.application.core.domain.Address
import com.pefonseca.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort
import org.springframework.stereotype.Component

@Component
class FindAddressByZipCodeAdapter(
    private val findAddressByZipCodeClient: FindAddressByZipCodeClient
): FindAddressByZipCodeOutputPort {

    override fun find(zipCode: String): Address =
        findAddressByZipCodeClient.find(zipCode).toAddress()

}