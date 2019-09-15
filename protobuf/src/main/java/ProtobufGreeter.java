import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import messages.GreeterGrpc;
import messages.Messages.HelloReply;
import messages.Messages.HelloRequest;
import hellofeature.Greeter;
import hellofeature.HelloReplyParam;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
class ProtobufGreeter extends GreeterGrpc.GreeterImplBase {
  @Inject Greeter greeter;
  @Inject ProtobufOutgoing outgoing;
  @Inject ProtobufIncoming incoming;

  @Override
  public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
    HelloReply.Builder reply = HelloReply.newBuilder();
    outgoing.map(reply, greeter.doSomething(incoming.map(req)));
    responseObserver.onNext(reply.build());
    responseObserver.onCompleted();
  }

}
