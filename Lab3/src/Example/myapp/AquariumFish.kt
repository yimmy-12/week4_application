package example.myapp

abstract class AquariumFish {
    abstract val color: String
}
interface FishAction  {
    fun eat()
}
interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}
class Plecostomus (fishColor: FishColor = GoldColor)://Plecostomus: FishAction, FishColor by GoldColor {
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor


class Shark: FishAction, FishColor by GoldColor {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

//class Shark: AquariumFish(), FishAction  {
//    override val color = "grey"
//    override fun eat() {
//        println("hunt and eat fish")
//    }
//}
//class Plecostomus: AquariumFish(), FishAction, FishColor  {
//    override val color = "gold"
//    override fun eat() {
//        println("eat algae")
//    }
//}