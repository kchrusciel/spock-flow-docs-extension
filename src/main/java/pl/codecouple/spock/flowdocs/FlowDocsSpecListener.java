package pl.codecouple.spock.flowdocs;

import org.spockframework.runtime.AbstractRunListener;
import org.spockframework.runtime.model.ErrorInfo;

/**
 * Flow docs spec listener generates documentation after each iteration.
 */
public class FlowDocsSpecListener extends AbstractRunListener {

    private ErrorInfo errorInfo;

    @Override
    public void error(ErrorInfo error) {
        errorInfo = error;
    }
}
