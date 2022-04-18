import java.io.*
import java.util.*

object Main {
    internal class FastReader {
        var br: BufferedReader
        var st: StringTokenizer? = null

        init {
            br = BufferedReader(InputStreamReader(System.`in`))
        }

        operator fun next(): String {
            while (st == null || !st!!.hasMoreTokens()) {
                try {
                    st = StringTokenizer(br.readLine())
                } catch (e: IOException) {
                    e.printStackTrace()
                }
            }
            return st!!.nextToken()
        }

        fun nextInt(): Int {
            return next().toInt()
        }

        fun nextLong(): Long {
            return next().toLong()
        }

        fun nextDouble(): Double {
            return next().toDouble()
        }

        fun nextLine(): String {
            var str = ""
            try {
                str = br.readLine().trim { it <= ' ' }
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return str
        }
    }

    internal class FastWriter {
        private val bw: BufferedWriter

        init {
            bw = BufferedWriter(OutputStreamWriter(System.out))
        }

        @Throws(IOException::class)
        fun print(`object`: Any) {
            bw.append("" + `object`)
        }

        @Throws(IOException::class)
        fun println(`object`: Any) {
            print(`object`)
            bw.append("\n")
        }

        @Throws(IOException::class)
        fun close() {
            bw.close()
        }
    }
}

fun main(args: Array<String>) {
        try {
            val `in` = Main.FastReader()
            val out = Main.FastWriter()
            var testCases = `in`.nextInt()
            while (testCases-- > 0) {
                //Write Code Here
            }
            out.close()
        } catch (e: Exception) {
            return
        }
    }
    
