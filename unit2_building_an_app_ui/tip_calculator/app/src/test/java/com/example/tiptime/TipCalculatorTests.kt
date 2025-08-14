package com.example.tiptime

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculateTip_20PercentNoRoundUp() {
        val amount = 10.0
        val tipPercentage = 20.0
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount, tipPercentage, false)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_10PercentNoRoundUp() {
        val amount = 10.0
        val tipPercentage = 10.0
        val expectedTip = NumberFormat.getCurrencyInstance().format(1)
        val actualTip = calculateTip(amount, tipPercentage, false)
        assertEquals(expectedTip, actualTip)
    }

}