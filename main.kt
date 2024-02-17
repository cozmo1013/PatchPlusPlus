fun main() {
    println("Welcome to Patch++!")
    println("Version 3.0")
    var cmd = ""
    var parsecom = mutableListOf<String>()
    var uint = 0
    var uint2 = 0
    val ints = mutableMapOf<String, Int>()
    val strs = mutableMapOf<String, String>()
    while (true) {
        cmd = readLine() ?: ""
        parsecom = cmd.split(" ").toMutableList()
        when (parsecom[0]) {
            "say" -> {
                println(parsecom.drop(1).joinToString(" "))
            }
            "add" -> {
                uint = parsecom[1].toInt()
                uint2 = parsecom[2].toInt()
                println(uint+uint2)
            }
            "int" -> {
                ints[parsecom[1]] = parsecom[2].toInt()
            }
            "str" -> {
                strs[parsecom[1]] = parsecom[2]
            }
            "allints" -> {
                println(ints)
            }
            "allstrs" -> {
                println(strs)
            }
            "sayint" -> {
                println(ints[parsecom[1]])
            }
            "times" -> {
                uint = parsecom[1].toInt()
                uint2 = parsecom[2].toInt()
                println(uint*uint2)
            }
            "addints" -> {
                uint = ints[parsecom[1]]!!.toInt()
                uint2 = ints[parsecom[2]]!!.toInt()
                println(uint+uint2)
            }
            "timesints" -> {
                uint = ints[parsecom[1]]!!.toInt()
                uint2 = ints[parsecom[2]]!!.toInt()
                println(uint*uint2)
            }
            "saystr" -> {
                println(strs[parsecom[1]])
            }
            "mergestr" -> {
                strs[parsecom[1]] = strs[parsecom[2]] + " " + strs[parsecom[3]]
            }
            "help" -> {
                println("int - save or edit an integer into a variable")
                println("str - save or edit a string into a variable")
                println("add - enter two integers and add them together")
                println("times - Mutiply 2 numbers")
                println("addints - adds your saved integers together")
                println("timesints - Mutiply ints, allstr - says the strings you saved")
                println("say - repeats after you, vals - shows your values, mergestr - combines your strings")
                println("clear - wipes screen")
                println("allints - says your integers, saystr and sayint - says a specified string")

            }
            "stop" -> {
                break
            }
            "clear" -> {
                for (i in 1..1000) {
                    println()
                }
            }
        }
    }
}
