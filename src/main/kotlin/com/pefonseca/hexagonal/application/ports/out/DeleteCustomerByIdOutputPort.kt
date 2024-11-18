package com.pefonseca.hexagonal.application.ports.out

interface DeleteCustomerByIdOutputPort {

    fun delete(id: String)

}