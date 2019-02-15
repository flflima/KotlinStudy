package academy.learnprogramming.functions

class Utils {

    fun upperFirstAndLast(str: String): String {
        val upperFirstAndLast = str.substring(0, 1).toUpperCase() + str.substring(1, str.length - 1) +
                str.substring(str.length - 1).toUpperCase()
        return upperFirstAndLast
    }
}
