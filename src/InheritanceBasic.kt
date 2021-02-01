open class A{
    open fun f() { print("A") }
    fun a() {print("a")}
}

interface  B{
    fun f() {print("B")}
    fun b() {print("b")}
}

class C(): A(), B{
    override fun f() {
        super<A>.f()
        super<B>.f()
        print("this is C")
    }

    fun temp(){
        f()
    }
}

abstract class AbsClass{
    abstract fun f()
}

class MyClass(): AbsClass(){
    override fun f() {
        TODO("Not yet implemented")
    }
}