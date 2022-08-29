package dev.monosoul.mockkissuereproducer

import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Test

class ValueClassConsumer {
    fun consume(instance: ValueClassWithValidationInConstructor) = "${instance.value}"
}

@JvmInline
value class ValueClassWithValidationInConstructor(val value: Int) {
    init {
        require(value in 1..10) { "$value is out of bounds" }
    }
}
class ValueClassConsumerTest {

    private val consumer = mockk<ValueClassConsumer>()

    @Test
    fun `should not throw an exception when stubbing ValueClassConsumer`() {
        every { consumer.consume(any()) } returns "something"
    }
}
