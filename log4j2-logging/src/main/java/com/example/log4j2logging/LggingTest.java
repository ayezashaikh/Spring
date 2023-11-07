package com.example.log4j2logging;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LggingTest {


    public static Logger logger = LogManager.getLogger(LggingTest.class);

    public static void main(String[] args) {

    }

    void payment() {

        logger.info("This info logs ");

        logger.error("This error logs ");

        logger.warn("This warning logs");

        logger.debug("This is debug log");

        logger.trace("This is tarce logs");

    }
}
