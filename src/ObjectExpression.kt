import java.awt.Window
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import javax.swing.JComponent

//class MyRunnable: Runnable{
//    override fun run() {
//        println("Hello Kotlin")
//    }
//
//}
fun main(args: Array<String>){
    val t = Thread( object : Runnable{
        override fun run() {
            println("hello kotlin")
        }

    })
    t.run()
}

fun countClicks(window: JComponent){
    var clickCount = 0
    var enterCount = 0

    window.addMouseListener(object : MouseAdapter(){
        override fun mouseClicked(e: MouseEvent) {
            clickCount++
        }

        override fun mouseEntered(e: MouseEvent?) {
            enterCount++
        }
    })

}

object DataProvierManager