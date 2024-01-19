class Mouse(_name : String = "The Mouse") : Animal(_name)
{
    private var CheeseAmount :Int = 0
    override fun makeASound()
    {
        squeak()
    }
    fun squeak()
    {
        println("$animalName squeaks!")
    }
    fun StealCheese(x :Int)
    {
        CheeseAmount += x
    }
    fun EatCheese()
    {
        CheeseAmount -= 1
    }
}