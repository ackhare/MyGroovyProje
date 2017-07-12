package Logging.log4j




/**
 * Created by chetan on 22/11/16.
 */
class HelloWorldLog {
    static void main(args) {
        def name = "World"
        Log.info "Hello $name!"
        Log.warn "Groovy ", "logging ", "arrived!"
        def x = 42
        Log.setLevel "debug"
        Log.debug "debug statement for var x: ", x
    }
}

//private static log(String level, Throwable t, Object... messages) {
//    if (messages) {
//        def log = logger()
//        if (level.equals("Warn") || level.equals("Error") || level.equals("Fatal") || log."is${level}Enabled"()) {
//            log."${level.toLowerCase()}"(messages.join(), t)
//        }
//    }
//}