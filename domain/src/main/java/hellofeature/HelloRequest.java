package hellofeature;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class HelloRequest {
  public abstract int getId();

  public static Builder builder() {
    return new AutoValue_HelloRequest.Builder();
  }

  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setId(int value);

    public abstract HelloRequest build();
  }
}
