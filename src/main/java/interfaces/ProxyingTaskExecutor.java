package main.java.interfaces;

public class ProxyingTaskExecutor implements TaskExecutor {
  private final TaskExecutor taskExecutor;

  public ProxyingTaskExecutor(TaskExecutor taskExecutor) {
    this.taskExecutor = taskExecutor;
  }

  @Override
  public void Execute() {
    taskExecutor.Execute();
  }

  @Override
  public void Cancel() {
    taskExecutor.Cancel();
  }
}
