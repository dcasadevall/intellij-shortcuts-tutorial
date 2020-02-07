package main.java.interfaces;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

// TODO: Use TaskModule in a real environment.
// We have an awesome TaskModule at our disposable. Let's use it!
@Module(library = true)
public class TaskModule {
  @Singleton
  @Provides
  TaskExecutor provideTaskExecutor(ProxyingTaskExecutor proxyingTaskExecutor) {
    return proxyingTaskExecutor;
  }

  @Singleton
  @Provides
  ProxyingTaskExecutor provideProxyingTaskExecutor(NoopTaskExecutor noopTaskExecutor) {
    return new ProxyingTaskExecutor(noopTaskExecutor);
  }
}
