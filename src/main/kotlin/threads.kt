import kotlinx.coroutines.*;
import kotlin.concurrent.thread

fun main() {

    println("Start: ${Thread.currentThread().name}");

    thread {
        println("Start: ${Thread.currentThread().name}");
        Thread.sleep(1000);
        println("Exit: ${Thread.currentThread().name}");

    }
    Thread.sleep(2000);
    println("Exit: ${Thread.currentThread().name}");

}