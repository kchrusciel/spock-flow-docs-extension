package pl.codecouple.spock.flowdocs.examples

import pl.codecouple.spock.flowdocs.FlowDocs
import spock.lang.Specification

@FlowDocs
class ExampleSpec extends Specification {

    def "abc"() {
        expect:
        true == true
    }

}
