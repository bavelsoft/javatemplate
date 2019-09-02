package hellofeature;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.relation.RelationService;

class GreeterJmx {
  MBeanServer server = MBeanServerFactory.createMBeanServer();
}
