package academy.learnprogramming.inheritance

import java.time.Year

fun main() {

    println(CompanyCommunications.getCompanyMessage())

    //


    println(SomeClass.accessVariable())

    println(SomeClass.simple("hello world").nome)

    println(SomeClass.withConditionalUpperCase("hello world", isUpperCase = true).nome)

    // anonymous
    wantsSomeInterface(object: SomeInterface {

        override fun mustImplement(myNum: Int) = "return ${10 * myNum}"

    })

    // documento
    println(Documentos.CPF.getDocumentoInfo())
}

// Singleton
object CompanyCommunications {

    private val ano = Year.now().value

    fun getCompanyMessage() = "Hello to our Company! Copyright \u00A9 $ano"
}

//static
class SomeClass private constructor(val nome: String) {

    companion object /*MyCompanion*/ {
        private val num = 10

        fun accessVariable() = "My static variable is $num"

        fun simple(nome: String) = SomeClass(nome)

        fun withConditionalUpperCase(nome: String, isUpperCase: Boolean): SomeClass {
            if (isUpperCase) {
                return SomeClass(nome.toUpperCase())
            } else {
                return SomeClass(nome.toLowerCase())
            }
        }

    }
}


/// Anonymous object

interface SomeInterface {
    fun mustImplement(myNum: Int): String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from wantsSomeInterface ${si.mustImplement(22)}")
}

// enum

enum class Documentos(val tipo: String, val numero: String) {
    CPF("CPF", "000.000.000-00"),
    RG("RG", "00.000.000-00");

    fun getDocumentoInfo() = "Este documento eh um $tipo com o numero $numero"
}