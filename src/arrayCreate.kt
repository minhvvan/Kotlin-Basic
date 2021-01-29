fun testArrayCreate() {
    val a = arrayOf("0","1","2","3","4")
    val b = Array(5, {i ->  i.toString()})

    for(c in a){
        print(c)
    }
    println()

    for(c in b){
        print(c)
    }
}