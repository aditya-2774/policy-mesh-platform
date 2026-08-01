package com.policymesh.customer.model

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.core.index.Indexed

@Document(collection = "customer")

class Customer {
    @Id
    String id

    @Field("customer_id")
    String customerId

    @Field("first_name")
    String firstName

    @Field("last_name")
    String lastName

    @Field("email")
    @Indexed(unique = true)
    String email

    @Field("phone_number")
    String phoneNumber

    @Field("address")
    Address address

    @Field("created_at")
    Date createdAt

    @Field("updated_at")
    Date updatedAt
    
    @Field("date_of_birth")
    Date dateOfBirth
}

