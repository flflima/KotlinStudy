package academy.learnprogramming.section6challenge

fun main() {
//    val range1 = 5..5000
//
//    for (i in range1.step(5)) {
//        println(i)
//    }

//    for (i in 5..5000 step 5) {
//        println(i)
//    }

//    val range2 = -500..0
//    for (i in range2) {
//        println(i)
//    }

//    // fibonacci
//    var penultimo = 0
//    var ultimo = 1
//    for (i in 0..14) {
//        if (i == 0 || i == 1) {
//            println(i)
//        } else {
//            println(penultimo + ultimo)
//            val temp = ultimo + penultimo
//            penultimo = ultimo
//            ultimo = temp
//
//        }
//    }

//    loopbreak@ for (i in 1..5) {
//        println(i)
//        if (i == 2) {
//            break
//        }
//        for (j in 11..20) {
//            if (i > 11) {
//                continue
//            }
//            println(j)
//
//            for (k in 100 downTo 90) {
//                println(k)
//                if (k == 98) {
//                    continue@loopbreak
//                }
//            }
//        }
//    }

    val num = 1003
    val dnum = if (num > 100) {
        -234.567
    } else if (num < 100) {
        4444.555
    } else {
        0.0
    }

    println(when {
        num > 100 -> -234.567
        num < 100 -> 4444.555
        else -> 0.0
    })

    println(dnum)
}