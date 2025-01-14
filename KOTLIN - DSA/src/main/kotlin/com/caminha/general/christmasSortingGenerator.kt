import kotlin.random.Random


//20 pessoas -> gerar 20 números aleatórios e assign it for each one of the people
fun generate1(names: List<String>) {
    //given a list of 20 names -> assign random numbers from 1 to 20 to each one of the names
    val strings = mutableListOf<String>()

    var x = (1..names.size).toMutableList()

    //looping here
    for(name in names) {
        //random is O(n) and remove is O(1)
        strings.add(
            "$name -> ${
                x.random().also {current ->
                    x.remove(current)
                }
            }"
        )
    }

    print(strings.joinToString(", "))
    // solution above ^ it's O(nˆ2)
}


fun generate2(names: List<String>) {
    val possibleNumbers = (1..names.size).shuffled() // O(n)


    //creates a mapping for index -> name
    //O(n)
    names.mapIndexed { index, s ->
        println("""
            $s -> ${
            possibleNumbers[index]
        }
        """.trimIndent())
    }

    //the coding above ^ it's O(n)
}


fun main() {
    val names = mutableListOf("caio", "mariana", "rita", "joseni", "julia")
    generate2(names)
}
