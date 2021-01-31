import kotlin.reflect.typeOf

fun whenBasic(x:Int){
    val validNumbers = listOf(3, 6, 9)
    when(x){
        in validNumbers -> print("x is valid")
        in 1..10 -> print("x is in the range")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}

fun hasPrefix(x: Any) = when(x) {
    is String -> {
        if(x.startsWith("pre")){
            print("yes")
        }else{
            print("no")
        }
    }
    else -> false
}

