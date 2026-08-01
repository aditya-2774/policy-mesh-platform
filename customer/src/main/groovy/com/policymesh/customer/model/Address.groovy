package com.policymesh.customer.model

import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.core.index.Indexed

class Address {
    @Field("street")
    String street

    @Field("city")
    String city

    @Field("state")
    String state

    @Field("zip_code")
    String zipCode

    @Field("country")
    String country
}