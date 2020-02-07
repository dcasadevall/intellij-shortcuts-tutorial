package main.java.interfaces;

public class ProxyingTaskExecutor implements TaskExecutor {
  private final TaskExecutor taskExecutor;

  public ProxyingTaskExecutor(TaskExecutor taskExecutor) {
    this.taskExecutor = taskExecutor;
  }

  @Override
  public void Execute(Task task) {
    taskExecutor.Execute(task);
  }

  @Override
  public void Cancel() {
    taskExecutor.Cancel();
  }
}
