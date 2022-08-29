package dev.monosoul.mockkissuereproducer

@JvmInline
value class ValueClassWithValidationInConstructor(val value: Int) {
    init {
        require(value in 1..10) { "${value} is out of bounds" }
    }
}
