import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

fun isBalanced(s: String): String {

    val myBrackets = Stack<Char>()

    for(c in s.toCharArray()) {
        when(c) {
            '{', '(', '[' -> myBrackets.push(c)
            ']' -> if(myBrackets.isEmpty() || myBrackets.pop() != '[') {
                println(myBrackets.toString())
                return "NO"}
            '}' -> if(myBrackets.isEmpty() || myBrackets.pop() != '{') {
                println(myBrackets.toString())
                return "NO"}
            ')' -> if(myBrackets.isEmpty() || myBrackets.pop() != '(') {
                println(myBrackets.toString())
                return "NO"}
        }
    }

    return "YES"
}

fun main() {

    val t = readLine()!!.trim().toInt()

    for(tItr in 1..t) {
        val s = readLine()!!

        val result = isBalanced(s)

        println(result)
    }


}

