class ExClass{
    companion object Factory{
        fun create(): MyClass = MyClass()
    }
}

fun main(args: Array<String>){
    val instance = ExClass.create()
}