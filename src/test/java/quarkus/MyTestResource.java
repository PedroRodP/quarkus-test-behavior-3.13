package quarkus;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

import java.util.Map;

public class MyTestResource implements QuarkusTestResourceLifecycleManager {

    @Override
    public Map<String, String> start() {
        System.out.println("This is my test resource being started");
        return null;
    }

    @Override
    public void stop() {
        System.out.println("This is my test resource being stopped");
    }
}
