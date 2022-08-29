package dev.monosoul.mockkissuereproducer

@JvmInline
value class ValueClassWithValidationInConstructor(val value: Int) {
    init {
        require(false) { "Validation failed" }
    }
}
