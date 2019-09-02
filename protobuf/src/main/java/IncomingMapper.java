import org.mapstruct.Mapper;
import static org.mapstruct.ReportingPolicy.ERROR;
import static org.mapstruct.ReportingPolicy.IGNORE;
import hellofeature.HelloRequest;
import messages.Messages.HelloRequestMessage;

@Mapper(unmappedTargetPolicy=ERROR, unmappedSourcePolicy=IGNORE)
interface IncomingMapper {
	HelloRequest map(HelloRequestMessage message);
}
