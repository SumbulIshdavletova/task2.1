package task1

import org.junit.Assert.assertEquals
import org.junit.Test

class MainKtTest {

    @Test
    fun calculateWithCommissionDefault() {
        val paymentType = "VkPay"
        val previousTransactions = 0
        val amount = 7000

        val result = calculateCommission(paymentType, previousTransactions, amount)

        assertEquals(0.0, result, 0.01)

    }

    @Test
    fun noCommission() {
        val paymentType = "VkPay"
        val previousTransactions = 2
        val amount = 570

        val result = calculateCommission(paymentType, previousTransactions, amount)

        assertEquals(0.0, result, 0.01)

    }

    @Test
    fun calculateWithCommission() {
        val paymentType = "Visa"
        val previousTransactions = 2
        val amount = 57000

        val result = calculateCommission(paymentType, previousTransactions, amount)

        assertEquals(362.0, result, 0.01)

    }

    @Test
    fun calculateWithCommissionMaestro() {
        val paymentType = "Maestro"
        val previousTransactions = 8
        val amount = 17000

        val result = calculateCommission(paymentType, previousTransactions, amount)

        assertEquals(122.0, result, 0.01)

    }

    @Test
    fun calculateWithCommissionMasterCard() {
        val paymentType = "MasterCard"
        val previousTransactions = 9
        val amount = 9000

        val result = calculateCommission(paymentType, previousTransactions, amount)

        assertEquals(74.0, result, 0.01)

    }

    @Test
    fun calculateWithCommissionMir() {
        val paymentType = "Мир"
        val previousTransactions = 1
        val amount = 9000

        val result = calculateCommission(paymentType, previousTransactions, amount)

        assertEquals(67.5, result, 0.01)
    }

    @Test
    fun calculateNoCommissionMasterCard() {
        val paymentType = "MasterCard"
        val previousTransactions = 0
        val amount = 9000

        val result = calculateCommission(paymentType, previousTransactions, amount)

        assertEquals(0.0, result, 0.01)
    }

    @Test
    fun calculateNoCommissionMaestro() {
        val paymentType = "Maestro"
        val previousTransactions = 2
        val amount = 7000

        val result = calculateCommission(paymentType, previousTransactions, amount)

        assertEquals(0.0, result, 0.01)
    }

    @Test
    fun calculateMinCommissionMir() {
        val paymentType = "Мир"
        val previousTransactions = 1
        val amount = 400

        val result = calculateCommission(paymentType, previousTransactions, amount)

        assertEquals(35.0, result, 0.01)
    }
    @Test
    fun calculateMinCommissionVisa() {
        val paymentType = "Visa"
        val previousTransactions = 1
        val amount = 400

        val result = calculateCommission(paymentType, previousTransactions, amount)

        assertEquals(35.0, result, 0.01)
    }
    @Test
    fun paymentTypeCommissionMasterCard() {
        val paymentType = "MasterCard"

        val result = paymentTypeCommission(paymentType)

        assertEquals(0.0, result,0.01)
    }

    @Test
    fun paymentTypeCommissionVisa() {
        val paymentType = "Visa"

        val result = paymentTypeCommission(paymentType)

        assertEquals(0.75, result,0.01)
    }
    @Test
    fun paymentTypeCommissionMir() {
        val paymentType = "Мир"

        val result = paymentTypeCommission(paymentType)

        assertEquals(0.75, result,0.01)
    }

    @Test
    fun paymentTypeCommissionVkPay() {
        val paymentType = "VkPay"

        val result = paymentTypeCommission(paymentType)

        assertEquals(0.0, result,0.01)
    }

}

