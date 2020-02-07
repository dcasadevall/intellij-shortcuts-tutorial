package main.java.interfaces;

public interface TaskExecutor {
  void Execute(Task task);
  void Cancel();
}
