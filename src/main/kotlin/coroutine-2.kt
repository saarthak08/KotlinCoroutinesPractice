import kotlinx.coroutines.*;

//Coroutine-1 can be simplified like this.
fun main() {
    //The coroutine doesn't stop until all its children are stopped.
    runBlocking {
        println("Start: ${Thread.currentThread().name}");

        launch {
            println("Start: ${Thread.currentThread().name}");
            myDelay(6000L);
            println("Exit: ${Thread.currentThread().name}");
        }
        println("Exit: ${Thread.currentThread().name}");
    }
}