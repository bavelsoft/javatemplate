import org.mapstruct.Mapper;
import static org.mapstruct.ReportingPolicy.ERROR;
import static org.mapstruct.ReportingPolicy.IGNORE;
import hellofeature.HelloRequestParam;
import messages.Messages.HelloRequest;

@Mapper(unmappedTargetPolicy=ERROR, unmappedSourcePolicy=IGNORE)
interface ProtobufIncoming {
	HelloRequestParam map(HelloRequest message);
}
