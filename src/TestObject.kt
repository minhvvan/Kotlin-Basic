object  MyClass_1{
    init{ println("create MyClass_1")}
}
object  MyClass_2{
    init{ println("create MyClass_2")}
}
object  MyClass_3{
    init{ println("create MyClass_3")}
}

fun main(args: Array<String>){
    println(1)
    println(MyClass_1)
    println(MyClass_1)
    println(MyClass_1)
    println(2)
    println(MyClass_2)
    println(MyClass_2)
    println(MyClass_2)
    println(3)
    println(MyClass_3)
    println(MyClass_3)
    println(MyClass_3)
}
