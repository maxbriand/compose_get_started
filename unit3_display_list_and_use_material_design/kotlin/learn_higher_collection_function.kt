class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut", 
        softBaked = true, 
        hasFilling = false, 
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {
    // For each function
    // cookies.forEach{
    //     println("${it.name}")
    // }

    println("Soft Baked Cookies:")

    // map function
    // val menu = cookies.map{
    //     "${it.name}"
    // }
    // menu.forEach {
    //     println(it)
    // }


    // filter function
    // val softBakedCookies = cookies.filter { it.softBaked }
    // softBakedCookies.forEach {
    //     println(it.name)}    


    // groupBy function
    // val softCookies = cookies.groupBy { it.softBaked }
    // softCookies[true]?.forEach {
    //     println(it.name)
    // }    

    // fold function
    // val totalPrince = cookies.fold(10.0) {total, cookie ->
    //     total + cookie.price
    // }
    // println("Total Price: $totalPrince")

    // sort function
    val sortedCookiesByPrice = cookies.sortedBy {
        it.price
    }
    sortedCookiesByPrice.forEach {
        println("${it.name} - \$${it.price}")
    }


    }

