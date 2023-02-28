fun main() {

    val a = Animal("f", "l")
    a.eat()
    a.makeNoise()
    a.sleep()

    val dog = Dog("meat", "home", "Dogge")
    dog.eat()
    dog.makeNoise()
    dog.sleep()
    dog.introduce()

    val cat = Cat("milk", "creed", "Belle")
    cat.introduce()
    val horse = Horse("carrot", "farm", "Llamma")
    horse.introduce()

    val animals = ArrayList<Animal>()
    animals.add(cat)
    animals.add(dog)
    animals.add(horse)

    val veterinary = Veterinary()
    for (animal in animals) {
        veterinary.treatAnimal(animal)
    }

}

open class Animal(val food: String, val location: String) {
    open fun makeNoise() {
        println("Animal makes noise")
    }

    open fun eat() {
        println("Animal eats $food")
    }

    fun sleep() {
        println("Animal sleeps in $location")
    }
}

class Dog(food: String, location: String, private val dogName: String) : Animal(food, location) {

    override fun makeNoise() {
        println("Dog makes noise")
    }

    override fun eat() {
        println("Dog eats $food")
    }

    fun introduce() {
        println("Dog`s name is $dogName")
    }
}

class Cat(food: String, location: String, private val catName: String) : Animal(food, location) {

    override fun makeNoise() {
        println("Cat makes noise")
    }

    override fun eat() {
        println("Cat eats $food")
    }

    fun introduce() {
        println("Cat`s name is $catName")
    }
}

class Horse(food: String, location: String, private val horseName: String) : Animal(food, location) {

    override fun makeNoise() {
        println("Horse makes noise")
    }

    override fun eat() {
        println("Horse eats $food")
    }

    fun introduce() {
        println("Horse`s name is $horseName")
    }
}

class Veterinary {
    fun treatAnimal(animal: Animal) {
        println("Animal`s food is ${animal.food} and location is ${animal.location}")
    }
}