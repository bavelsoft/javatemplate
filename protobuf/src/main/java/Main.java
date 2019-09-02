import dagger.Component;

public class Main {
  public static void main(String[] args) {
    DaggerJavaTemplate.builder().build();
    //TODO
  }
}

@Component(modules = ProtobufModule.class)
interface JavaTemplate {
}
