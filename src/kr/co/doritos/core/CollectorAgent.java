package kr.co.doritos.core;

import kr.co.doritos.core.dto.ServiceDTO;
import kr.co.doritos.core.info.CollectorAgentInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class CollectorAgent {

    private List<ServiceDTO> serviceList;
    private final String CONF_PATH = String.format("%s/conf/service.xml", System.getProperty("user.dir"));
    private File CONF_FILE;

    public void boot() {

        // Product Info
        CollectorAgentInfo.printProductInfo();

        try {
            // initialize
            initialize();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
            return;
        }

        // run...
        run();
    }

    private void initialize() throws Exception {

        CONF_FILE = new File(CONF_PATH);

        // Validate service.xml
        validateConfFile();

        // Mapping... service.xml -> Java Object
        mappingServiceList();
    }

    private void validateConfFile() throws Exception {
        if (!CONF_FILE.exists()) {
            throw new FileNotFoundException(CONF_PATH);
        }

        if (!CONF_FILE.isFile()) {
            throw new IllegalArgumentException(String.format("%s is Not File", CONF_PATH));
        }

        if (!CONF_FILE.canRead()) {
            throw new IllegalArgumentException(String.format("%s could not be read", CONF_PATH));
        }
    }

    private void mappingServiceList() throws Exception {

    }

    private void run() {

    }
}