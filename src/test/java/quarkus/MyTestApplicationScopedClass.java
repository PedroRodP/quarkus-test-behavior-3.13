package quarkus;

import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyTestApplicationScopedClass {

    @Startup
    public void onStart() {
        System.out.println("This is the test method I would expect to run just once for the whole test set");
    }
}
