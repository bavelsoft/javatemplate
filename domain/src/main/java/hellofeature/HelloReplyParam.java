package hellofeature;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class HelloReplyParam {
  public abstract String getMessage();

  public static Builder builder() {
    return new AutoValue_HelloReplyParam.Builder();
  }

  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setMessage(String value);

    public abstract HelloReplyParam build();
  }
}
