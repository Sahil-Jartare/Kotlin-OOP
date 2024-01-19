//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
    val dog0: Animal = Dog("Hachiko")
    moveAndMakeASound(dog0)
    println()
    val cat0: Animal = Cat("Tom")
    moveAndMakeASound(cat0)
    println()
    val mouse0 :Animal = Mouse("Jerry")
    moveAndMakeASound(mouse0)

}

fun moveAndMakeASound(animal: Animal)//Polymorphism
{
    animal.move("Forward")
    animal.makeASound()
}