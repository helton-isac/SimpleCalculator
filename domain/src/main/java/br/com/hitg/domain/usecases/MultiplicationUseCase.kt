package br.com.hitg.domain.usecases

import br.com.hitg.domain.mathEngine.MathEngine
import java.math.BigDecimal

class MultiplicationUseCase(
        private val mathEngine: MathEngine
) {

    fun execute(v1: BigDecimal, v2: BigDecimal): BigDecimal {
        return mathEngine.multiply(v1, v2)
    }
}