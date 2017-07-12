package Logging.log4j

/**
 * Created by chetan on 22/11/16.
 */

import org.apache.log4j.*

class Log {
    public static String PATTERN = "%d{ABSOLUTE} %-5p [%c{1}] %m%n"
    public static Level LEVEL = Level.INFO
    private static boolean initialized = false

    private static def logger() {
        def caller = Thread.currentThread().stackTrace
        if (!initialized) basic()

        return Logger.getInstance(this.class)
    }

    static basic() {
        def simple = new PatternLayout(PATTERN)
        BasicConfigurator.configure(new ConsoleAppender(simple))
        LogManager.rootLogger.level = LEVEL
        initialized = true
    }

    static setLevel(level) {
        def Level l = null
        if (level instanceof Level) {
            l = level
        } else if (level instanceof String) {
            l = (Level."${level.toUpperCase()}") ?: null
        }
        if (l) LogManager.rootLogger.level = l
    }

    static trace(Object... messages) { log("Trace", null, messages) }

    static trace(Throwable t, Object... messages) { log("Trace", t, messages) }

    static debug(Object... messages) { log("Debug", null, messages) }

    static debug(Throwable t, Object... messages) { log("Debug", t, messages) }

    static info(Object... messages) { log("Info", null, messages) }

    static info(Throwable t, Object... messages) { log("Info", t, messages) }

    static warn(Object... messages) { log("Warn", null, messages) }

    static warn(Throwable t, Object... messages) { log("Warn", t, messages) }

    static error(Object... messages) { log("Error", null, messages) }

    static error(Throwable t, Object... messages) { log("Error", t, messages) }

    static fatal(Object... messages) { log("Fatal", null, messages) }

    static fatal(Throwable t, Object... messages) { log("Fatal", t, messages) }

    private static log(String level, Throwable t, Object... messages) {
        if (messages) {
            def log = logger()
            if (level.equals("Warn") || level.equals("Error") || level.equals("Fatal") || log."is${level}Enabled"()) {
                log."${level.toLowerCase()}"(messages.join(), t)
            }
        }
    }
}
