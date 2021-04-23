package facebook

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class HomepageInterceptorSpec extends Specification implements InterceptorUnitTest<HomepageInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test homepage interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"homepage")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
