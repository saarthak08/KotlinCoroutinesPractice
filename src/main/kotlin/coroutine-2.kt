import kotlinx.coroutines.*;

//Coroutine-1 can be simplified like this.
fun main() {
    //The coroutine doesn't stop until all its children are stopped.
    runBlocking {
        println("Start 1: ${Thread.currentThread().name}");

        launch {
            println("Start 2: ${Thread.currentThread().name}");
            myDelay(6000L);
            println("Exit 1: ${Thread.currentThread().name}");
        }
        println("Exit 2: ${Thread.currentThread().name}");
    }
}