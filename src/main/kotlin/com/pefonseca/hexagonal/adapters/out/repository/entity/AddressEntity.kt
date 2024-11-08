package com.pefonseca.hexagonal.adapters.out.repository.entity

import com.pefonseca.hexagonal.application.core.domain.Address

class AddressEntity(
    val street: String,
    val city: String,
    val state: String
) {
    constructor(address: Address): this(
        address.street,
        address.city,
        address.state
    )
}