package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;

public class MainTest {
  private static final Logger logger = LoggerFactory.getLogger(MainTest.class);
  private Main main;

  @BeforeEach
  void setUp() {
    logger.info("setUp");
    main = new Main();
  }

  @Test
  void init() throws IOException {
    main.init();
    assertTrue(true);
  }
}
