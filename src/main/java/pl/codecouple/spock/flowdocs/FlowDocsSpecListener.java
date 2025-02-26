package pl.codecouple.spock.flowdocs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spockframework.runtime.AbstractRunListener;
import org.spockframework.runtime.model.ErrorInfo;
import org.spockframework.runtime.model.SpecInfo;

/**
 * Flow docs spec listener generates documentation after each iteration.
 */
public class FlowDocsSpecListener extends AbstractRunListener {

    private static final Logger log = LoggerFactory.getLogger(FlowDocsSpecListener.class);

    private ErrorInfo errorInfo;

    @Override
    public void error(ErrorInfo error) {
        errorInfo = error;
    }

    @Override
    public void afterSpec(SpecInfo specInfo) {
        log.debug("FlowDocs extension was applied");
        if (errorInfo != null) {
            log.warn("FlowDocs generation is skipped. Spec failed.");
        }
    }
}
