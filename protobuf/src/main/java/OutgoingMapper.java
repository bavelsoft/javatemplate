import org.mapstruct.Mapper;
import static org.mapstruct.ReportingPolicy.ERROR;
import static org.mapstruct.ReportingPolicy.IGNORE;
import hellofeature.HelloReply;
import messages.Messages.HelloReplyMessage;

@Mapper(unmappedTargetPolicy=IGNORE, unmappedSourcePolicy=ERROR)
interface OutgoingMapper {
	HelloReplyMessage map(HelloReply event);
}
