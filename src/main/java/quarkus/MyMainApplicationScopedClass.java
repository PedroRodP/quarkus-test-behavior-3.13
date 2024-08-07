package quarkus;

import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyMainApplicationScopedClass {

    @Startup
    public void onStart() {
        System.out.println("This is the main method I would expect to run just once for the whole test set");
    }
}
