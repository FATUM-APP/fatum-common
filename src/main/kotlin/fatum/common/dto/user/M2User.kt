package fatum.common.dto.user

import fatum.common.enums.user.Gender
import fatum.common.enums.user.UserRole
import fatum.common.enums.user.VerificationStatus
import java.time.LocalDate

data class M2User(
    val userId: String,
    val birthDate: LocalDate,
    val role: UserRole,
    val verificationStatus: VerificationStatus,
    val isActive: Boolean,
    val gender: Gender,
    val principalAddress: AddressDTO
){
    val isProfessional: Boolean get() = role == UserRole.PROFESSIONAL
}