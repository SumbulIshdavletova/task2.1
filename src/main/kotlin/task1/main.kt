package task1

fun main() {

    var commissionAmount = calculateCommission("Maestro", 2, 7000)
    println("Комиссия равна: $commissionAmount")

}

fun calculateCommission(paymentType: String = "VkPay", previousTransactions: Int = 0, amount: Int): Double {
    val VisaMinCommission = 35.0
    var commissionAmount = if (amount * previousTransactions > 75_000 || paymentType == "Maestro"
        && paymentType == "MasterCard") amount * 0.6 / 100 + 20 else (amount * paymentTypeCommission(paymentType) / 100)
    return if (commissionAmount < VisaMinCommission && paymentType == "Мир" ||
        commissionAmount < VisaMinCommission && paymentType == "Visa") VisaMinCommission
    else commissionAmount

}

fun paymentTypeCommission(paymentType: String) = when (paymentType) {
    "VkPay" -> 0.0
    "Maestro", "MasterCard" -> 0.0
    else -> 0.75
}
