package hellofeature;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class HelloRequestParam {
  public abstract String getName();

  public static Builder builder() {
    return new AutoValue_HelloRequestParam.Builder();
  }

  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setName(String value);

    public abstract HelloRequestParam build();
  }
}
