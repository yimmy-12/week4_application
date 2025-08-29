package example.myapp

fun main(){
    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}")

    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.toList())

    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}\n")
    println("${equipment2.first.second}")

//    val equipment = "fish net" to "catching fish"
//    val (tool, use) = equipment
//    println("$tool is used for $use")
//    val equipment = "fish net" to "catching fish"
//    val (tool, use) = equipment
//    println("$tool is used for $use")

    val list = listOf(1, 5, 3, 4)
    println(list.sum())

//    val list2 = listOf("a", "bbb", "cc")
//    println(list2.sum()) //ใช้ไม่ได้

//    val list2 = listOf("a", "bbb", "cc")
//    println(list2.sumBy { it.length })

    val list2 = listOf("a", "bbb", "cc")
    for (s in list2.listIterator()) {
        println("$s ")
    }
}