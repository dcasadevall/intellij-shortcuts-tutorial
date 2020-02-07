package main.java.interfaces;

public class Task {
  private String name;
  private int priority;

  private Task(Builder builder) {
    name = builder.name;
    priority = builder.priority;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static final class Builder {
    private String name;
    private int priority;

    private Builder() {
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withPriority(int priority) {
      this.priority = priority;
      return this;
    }

    public Task build() {
      return new Task(this);
    }
  }
}
