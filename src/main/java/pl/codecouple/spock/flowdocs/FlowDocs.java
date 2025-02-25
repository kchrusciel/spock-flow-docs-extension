package pl.codecouple.spock.flowdocs;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Annotated method or class that you would like to have flow docs enabled.
 */
@Retention(RUNTIME)
@Target({TYPE, METHOD})
public @interface FlowDocs {
}
