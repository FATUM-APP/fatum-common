package fatum.common.dto.user

data class AddressDTO(
    val residence: String,
    val alias: String,
    val city: String,
    val state: String,
    val country: String,
    val username: String
)