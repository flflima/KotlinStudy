package academy.learningprogramming.anothermodule

import academy.learnprogramming.inheritance.Documentos.CPF
import academy.learnprogramming.inheritance.Documentos.RG
import academy.learnprogramming.inheritance.CompanyCommunications as Comm

fun main() {
    println(CPF.getDocumentoInfo())
    println(RG.getDocumentoInfo())
    println(Comm.getCompanyMessage())
}