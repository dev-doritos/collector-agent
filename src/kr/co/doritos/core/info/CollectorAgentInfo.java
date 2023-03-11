package kr.co.doritos.core.info;

public class CollectorAgentInfo {

    private static CollectorAgentInfo this_;

    public static void printProductInfo() {
        if (this_ == null) {
            this_ = new CollectorAgentInfo();
        }

        System.out.println();
        System.out.println(this_.PRODUCT_BANNER);
        System.out.println(String.format("%s %s", this_.PRODUCT_NAME, this_.PRODUCT_VERSION));
    }

    private final String PRODUCT_NAME;
    private final String PRODUCT_VERSION;
    private final String PRODUCT_BANNER;

    private CollectorAgentInfo() {
        this.PRODUCT_NAME = "Collector-Agent";
        this.PRODUCT_VERSION = "v1.0.0";
        this.PRODUCT_BANNER = generateBanner();
    }

    private String generateBanner() {
        StringBuilder builder = new StringBuilder();
        builder
            .append("   _____      _ _           _                                                 _   					").append(System.lineSeparator())
            .append("  / ____|    | | |         | |                          /\\                   | |  				").append(System.lineSeparator())
            .append(" | |     ___ | | | ___  ___| |_ ___  _ __   ______     /  \\   __ _  ___ _ __ | |_ 				").append(System.lineSeparator())
            .append(" | |    / _ \\| | |/ _ \\/ __| __/ _ \\| '__| |______|   / /\\ \\ / _` |/ _ \\ '_ \\| __|			").append(System.lineSeparator())
            .append(" | |___| (_) | | |  __/ (__| || (_) | |              / ____ \\ (_| |  __/ | | | |_ 				").append(System.lineSeparator())
            .append("  \\_____\\___/|_|_|\\___|\\___|\\__\\___/|_|             /_/    \\_\\__, |\\___|_| |_|\\__|		").append(System.lineSeparator())
            .append("                                                              __/ |               					").append(System.lineSeparator())
            .append("                                                             |___/                					").append(System.lineSeparator())
        ;
        return builder.toString();
    }
}
