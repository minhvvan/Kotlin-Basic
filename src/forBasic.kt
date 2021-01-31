fun forBasic(){
    var collection = listOf(1, 2, 3, 4, 5)
    collection.iterator()
    for (item in collection){
        println(item)
    }
}

fun forBasic2(args: Array<String>){
    val myData = MyData()
    for (item in myData){
        println(item)
    }
}

class MyIterator{
    val data = listOf(1, 2, 3, 4, 5)
    var idx = 0
    operator  fun hasNext(): Boolean{
        return data.size > idx
    }

    operator  fun next(): Int {
        return data[idx++]
    }
}

class MyData{
    operator fun iterator(): MyIterator{
        return MyIterator()
    }
}

fun indexPrint(){
    val array = arrayOf("가", "나", "다")
    for(i in array.indices){
        println("$i: ${array[i]}")
    }
}

fun UsingWithIndex(){
    val array = arrayOf("가", "나", "다")
    for((index, value) in array.withIndex()){
        println("$index: $value")
    }
}
