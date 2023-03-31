package pl.lechowicz.click

class Student(private val name: String, private val lastName: String) {
    override fun toString(): String {
        return "$name $lastName"
    }
}
