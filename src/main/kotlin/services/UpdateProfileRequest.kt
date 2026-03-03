package org.delcom.services

data class UpdateProfileRequest(
    val name: String,
    val username: String,
    val about: String?
)