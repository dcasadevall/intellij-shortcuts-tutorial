package main.java.interfaces;

/**
 * This executor does nothing.
 */
class NoopTaskExecutor implements TaskExecutor {
  private final String name;

  public NoopTaskExecutor(String name) {
    this.name = name;
  }

  @Override
  public void Execute(Task task) {

  }

  @Override
  public void Cancel() {

  }
}
