fun main(args: Array<String>) {

    Calculator(6,6).op2()

    Calculator(4,5).op1()

    Vehicle("Subaru","Baracca").details()
    Car("Toyota","Yaris").details()
    Bike("Kawasaki","Ninja").details()

}


//USANDO INHERITANCE

open class Vehicle(open val model: String, open val brand: String){
    open fun details(){
        println("Vehicle details:" +
                "Model: $model" +
                "Brand: $brand\n")
    }
}

class Car(override val model: String, override val brand: String): Vehicle(model,brand){
    override fun details(){
        println("Car details:" +
                "Model: $model" +
                "Brand: $brand\n")
    }
}

class Bike(override val model: String, override val brand: String): Vehicle(model, brand){
    override fun details() {
        println("Bike details:" +
                "Model: $model" +
                "Brand: $brand\n")
    }
}


//USANDO INTERFACE

interface Operations{
    var num1: Int
    var num2: Int

    open fun op1(){
        println("${num1 + num2}")
    }

    open fun op2(){
        println("${num1 - num2}")
    }
}

class Calculator(override var num1: Int = 5, override var num2: Int = 6): Operations{

    override fun op1() {
        println("${num1 * num2}\n")
    }

    override fun op2() {
        println("${num1 / num2}\n")
    }

}

