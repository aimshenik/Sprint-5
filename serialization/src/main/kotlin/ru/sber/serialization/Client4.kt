package ru.sber.serialization

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonClassDescription
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import java.util.Optional

data class Client4(
    @JsonProperty("firstName")
    val firstName: String,
    @JsonProperty("lastName")
    val lastName: String,
    @JsonProperty("middleName")
    val middleName: Optional<String>,
    @JsonProperty("passportNumber")
    val passportNumber: String,
    @JsonProperty("passportSerial")
    val passportSerial: String,
    @JsonProperty("birthDate")
    val birthDate: LocalDate
)
