import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import static org.mapstruct.ReportingPolicy.ERROR;
import static org.mapstruct.ReportingPolicy.IGNORE;
import hellofeature.HelloReplyParam;
import messages.Messages.HelloReply;

@Mapper(unmappedTargetPolicy=IGNORE, unmappedSourcePolicy=ERROR)
interface OutgoingMapper {
  void map(@MappingTarget HelloReply.Builder out, HelloReplyParam in);
}
