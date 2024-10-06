package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SportsLoggerAppTest {

    @Test
    public void testActivityLogging() {
        SportsLoggerApp logger = new SportsLoggerApp("Cycling", 45);
        assertEquals("Cycling", logger.getActivity());
        assertEquals(45, logger.getDuration());
    }
}

