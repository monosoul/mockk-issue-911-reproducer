package dev.monosoul.mockkissuereproducer

import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
class ValueClassConsumerTest {

    @MockK
    private lateinit var consumer: ValueClassConsumer

    @Test
    fun `should not throw an exception when stubbing ValueClassConsumer`() {
        every { consumer.consume(any()) } returns "something"
    }
}
