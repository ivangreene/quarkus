package io.quarkus.test.junit.callback;

public interface QuarkusTestAfterEachCallback {

    void afterEach(QuarkusTestMethodContext context);
}
