package hellofeature;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Greeter {
  private static final Logger logger = LogManager.getLogger(Greeter.class);

  public HelloReplyParam doSomething(HelloRequestParam command) {
    logger.info("did something");
    return null;
  }
}
