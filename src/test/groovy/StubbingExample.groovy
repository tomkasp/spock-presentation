import spock.lang.Specification
import spock.lang.Unroll

class StubbingExample extends Specification {

    BusinessObject businessObject;

    def setup() {
        businessObject = Stub(BusinessObject) {
            businessMethod(7, 7) >> 5
        }
    }

    @Unroll
    def "check how stubs work"() {
        expect: "business method computation result"

        businessObject.businessMethod(first, second) == result

        where: "data driven is"
        first | second | result
        7 | 7 | 5
        5 | 6 | 11

    }

    def "argument constraint test"() {
        setup:
        def computationResult;
        businessObject.businessMethod(_, _) >> 10

        when:
        computationResult = businessObject.businessMethod(1, 1)

        then:
        computationResult == 10;
    }
}
