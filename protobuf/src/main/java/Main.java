import javax.annotation.Nullable;
import dagger.Component;

public class Main {
  public static void main(String[] args) {
    DaggerJavaTemplate.builder().build();
  }
}

@Component(modules = ProtobufModule.class)
interface JavaTemplate {
}
