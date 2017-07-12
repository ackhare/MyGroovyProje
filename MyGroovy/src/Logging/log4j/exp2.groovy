package Logging.log4j

import org.apache.log4j.BasicConfigurator
import org.apache.log4j.ConsoleAppender
import org.apache.log4j.Level
import org.apache.log4j.LogManager
import org.apache.log4j.Logger
import org.apache.log4j.PatternLayout

/**
 * Created by chetan on 22/11/16.
 */


class HelloWorldNoLog {
    public static String PATTERN = "%d{ABSOLUTE} %-5p [%c{1}] %m%n"

    static void main(args) {
        def simple = new PatternLayout(PATTERN)
        BasicConfigurator.configure(new ConsoleAppender(simple))
        LogManager.rootLogger.level = Level.INFO
        Logger log = Logger.getInstance(HelloWorldNoLog.class)
        def name = "World"
        log.info "Hello $name!"
        log.warn "Groovy " + "logging " + "ahead..."
        def x = 42
        log.setLevel Level.DEBUG
        if (log.isDebugEnabled()) {
            log.debug "debug statement for var x: " + x
        }
    }
}