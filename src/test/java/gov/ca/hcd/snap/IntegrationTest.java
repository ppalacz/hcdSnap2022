package gov.ca.hcd.snap;

import gov.ca.hcd.snap.HcdSnap2022App;
import gov.ca.hcd.snap.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { HcdSnap2022App.class, TestSecurityConfiguration.class })
public @interface IntegrationTest {
}
