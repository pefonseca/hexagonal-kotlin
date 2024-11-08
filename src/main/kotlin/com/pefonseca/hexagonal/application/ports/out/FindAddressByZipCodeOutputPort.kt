package com.pefonseca.hexagonal.application.ports.out

import com.pefonseca.hexagonal.application.core.domain.Address

interface FindAddressByZipCodeOutputPort {

    fun find(zipCode: String): Address

}