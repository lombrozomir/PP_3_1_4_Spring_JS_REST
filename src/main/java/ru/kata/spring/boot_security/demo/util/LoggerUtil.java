package ru.kata.spring.boot_security.demo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtil {
    private static final Logger logger = LoggerFactory.getLogger(LoggerUtil.class);

    public static void logInfo(String message) {
        logger.info(message);
    }

    public static void logError(String message, Throwable throwable) {
        logger.error(message, throwable);
    }

    public static void logDebug(String message) {
        logger.debug(message);
    }
}
