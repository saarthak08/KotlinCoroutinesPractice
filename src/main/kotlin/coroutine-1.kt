import kotlinx.coroutines.*;
import kotlin.concurrent.thread

fun main() {

    runBlocking {

        launch {
            myDelay(5000L);
            println("hello: ${Thread.currentThread().name}");
        }
        println("hi");
        //Blocks the current thread while waiting for all children to complete.
        runBlocking {
            println("Start 1: ${Thread.currentThread().name}");

            //The lifetime of the new coroutine is limited only by the lifetime of the whole application.
            val job = launch {
                println("Start 2: ${Thread.currentThread().name}");
                myDelay(6000L);
                println("Exit 1: ${Thread.currentThread().name}");
            }
            // myDelay(8000L);
            job.
            job.join();
            println("Exit 2: ${Thread.currentThread().name}");
        }

    }
}

//Suspend functions run inside a coroutine only.
suspend fun myDelay(del:Long) {
    delay(del); //blocks the coroutine not the thread.
}