package academy.learnprogramming.iokotlin

import java.io.File

fun main() {
    // read all file lines in one time
//    val lines = File("test.txt").reader().readLines()
//
//    lines.forEach { println(it) }

//    val lines = File("test.txt").reader().use { it.readText() }
//
//    println(lines)

    File("test.txt").reader().forEachLine { println(it) }
}