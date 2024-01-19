class Cat(_name: String = "The Cat"): Animal(_name)//Inheritance
{
    override fun makeASound()//Encapsulation
    {
        meow()
    }
    private fun meow()
    {
        println("$animalName said meow!")
    }

}