package kr.co.doritos.core.logger;

import java.io.PrintStream;

public enum LoggerLevel {

    info("I", "▷", System.out),
    error("E", "▶", System.err),
    ;

    String signature;
    String symbol;
    PrintStream out;

    LoggerLevel(String signature, String symbol, PrintStream out) {
        this.signature = signature;
        this.symbol = symbol;
        this.out = out;
    }

    public String getSignature() {
        return this.signature;
    }
    public String getSymbol() {
        return this.symbol;
    }
    public PrintStream getOut() { return this.out; }
}