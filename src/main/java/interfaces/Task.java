package main.java.interfaces;

import java.util.Objects;

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

  @Override
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (other == null || getClass() != other.getClass()) {
      return false;
    }
    Task task = (Task) other;
    return priority == task.priority &&
        name.equals(task.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, priority);
  }

  @Override
  public String toString() {
    return "Task{" +
        "name='" + name + '\'' +
        ", priority=" + priority +
        '}';
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
