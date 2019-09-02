package hellofeature;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloService {
  private static final Logger logger = LogManager.getLogger(HelloService.class);

  public HelloReply doSomething(HelloRequest command) {
    logger.info("did something");
    return null;
  }
}
