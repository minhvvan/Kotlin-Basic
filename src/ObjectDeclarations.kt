object CountManager {
    var count = 0
}
fun main(args: Array<String>){
    CountManager.count++
    println(CountManager.count)
    CountManager.count++
    println(CountManager.count)
    CountManager.count++
    println(CountManager.count)
    CountManager.count++
    println(CountManager.count)
}