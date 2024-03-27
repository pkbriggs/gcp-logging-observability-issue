package org.example;

import io.grpc.gcp.observability.GcpObservability;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) throws IOException {
    Main main = new Main();
    main.init();
  }

  public void init() throws IOException {
    logger.info("Hello logger!");
    GcpObservability observability = GcpObservability.grpcInit();
    System.out.println("Hello world!");
    observability.close();
  }
}