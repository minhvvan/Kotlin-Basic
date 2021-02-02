class Address{
    val isEmpty: Boolean
        get() { return false }
}


public class MyTest{
    lateinit var subject: String

    fun setup(){
        subject = "setup"
    }

    fun test(){
        print(subject)
    }
}
