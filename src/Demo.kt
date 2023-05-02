//Named arguments is a feature in Kotlin that allows you to pass arguments to a function by specifying the name of the parameter along with the value, instead of relying solely on the order of the parameters.

fun printInfo(name: String, age: Int, city: String) {
	println("Name: $name")
	println("Age: $age")
	println("City: $city")
}

fun main(args: Array<String>) {
	printInfo(name = "John", age = 30, city = "New York")
	printInfo(city = "Los Angeles", age = 25, name = "Emily")
}
