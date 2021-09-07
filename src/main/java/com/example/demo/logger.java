package com.example.demo;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class logger {
    private static Logger logger= Logger.getLogger(com.example.demo.logger.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.trace("This is trace message");
        logger.debug("This is debug message");
        logger.info("This is info message");
        logger.warn("This is warn message");
    }

}
