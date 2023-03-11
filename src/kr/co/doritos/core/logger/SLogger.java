package kr.co.doritos.core.logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SLogger implements LoggerAdapter {

    private static SLogger instance;
    public static SLogger getLogger() {
        if (instance == null) {
            instance = new SLogger();
        }
        return instance;
    }

    private SLogger() {}
    private final DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_STR);

    @Override
    public void info(String message) {
        this.writeLogger(LoggerLevel.info, message, 3);
    }

    @Override
    public void info(String format, Object... objects) {

    }

    @Override
    public void error(String message) {
        this.writeLogger(LoggerLevel.error, message, 3);
    }

    @Override
    public void error(String format, Object... objects) {

    }

    private void writeLogger(LoggerLevel level, String message, int stackDepth) {

        level = level == null ? LoggerLevel.info : level;

        String className = "";
        int lineNumber = 0;

        try {

            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[stackDepth];

            className = stackTraceElement.getClassName();
            lineNumber = stackTraceElement.getLineNumber();

            StringBuilder builder = new StringBuilder();
            builder
                .append("[").append(dateFormat.format(new Date())).append("]")
                .append("[").append(level.getSignature()).append("]")
                .append("[").append(className).append(":").append(lineNumber).append("] ").append(level.getSymbol())
                .append(" ").append(message)
            ;

            level.getOut().println(builder.toString());

        } catch (Exception e) {
            System.out.println(message);
        }
    }
}