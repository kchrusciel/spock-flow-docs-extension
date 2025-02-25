package pl.codecouple.spock.flowdocs;

import org.spockframework.runtime.extension.IAnnotationDrivenExtension;
import org.spockframework.runtime.model.SpecInfo;

/**
 * Flow docs extension which adds additional capability to generate docs for your application flow.
 */
public class FlowDocsExtension implements IAnnotationDrivenExtension<FlowDocs> {

    @Override
    public void visitSpecAnnotation(FlowDocs annotation, SpecInfo spec) {

    }

}