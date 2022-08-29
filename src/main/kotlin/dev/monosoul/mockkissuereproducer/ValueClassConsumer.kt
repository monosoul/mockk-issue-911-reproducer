package dev.monosoul.mockkissuereproducer

class ValueClassConsumer {
    fun consume(instance: ValueClassWithValidationInConstructor) = "${instance.value}"
}
