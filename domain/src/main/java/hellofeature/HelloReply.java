package hellofeature;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class HelloReply {
  public abstract int getId();

  public static Builder builder() {
    return new AutoValue_HelloReply.Builder();
  }

  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setId(int value);

    public abstract HelloReply build();
  }
}
