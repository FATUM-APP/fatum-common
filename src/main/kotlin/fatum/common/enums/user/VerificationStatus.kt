package fatum.common.enums.user

enum class VerificationStatus {
    UNVERIFIED, VERIFIED, REJECTED, MANUAL_REVIEW;

    fun isTerminal(): Boolean{
        return this != UNVERIFIED
    }
}