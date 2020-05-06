class Application(val name: String) {

    // write the run method here
    fun run(arr: Array<String>) {
        println(name)
        for (a in arr) {
            println(a)
        }
    }
}