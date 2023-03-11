package kr.co.doritos.core.logger;

public interface LoggerAdapter {

    String DELIM = "{}";
    String DELIM_REGEX = "\\{\\}";
    String DATE_FORMAT_STR = "yyyyMMdd HH:mm:ss:SSS";

    void info(String message);
    void info(String format, Object... objects);
    void error(String message);
    void error(String format, Object... objects);
}
