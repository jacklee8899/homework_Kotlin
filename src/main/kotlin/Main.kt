import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    print("Please enter number of tickets: ")
    val totalTicket : Int = scanner.nextInt()

    print("How many round-trip tickets: ")
    val roundTripTicket : Int = scanner.nextInt()

    val tester = Tester(totalTicket, roundTripTicket)
    tester.print()
}

class Tester(var totalTicket:Int, var roundTripTicket:Int) {
    fun print() {
        val totalsum : Int = ((totalTicket-roundTripTicket)*1000 + roundTripTicket * 2000 * 90 /100)

        println("Total tickets: " + totalTicket +
                " Round-trip: " + roundTripTicket +
                " Total: " + totalsum)
    }
}
