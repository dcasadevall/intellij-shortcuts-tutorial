package main.java.interfaces;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

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
