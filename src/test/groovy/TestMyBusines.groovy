import spock.lang.Specification
import spock.lang.Unroll

class TestMyBusinessFunctions extends Specification {


    BusinessObject businessObject

    def setup() {
        businessObject = new BusinessObject();
    }

    def "Check some business method"() {
        expect:
        businessObject.businessMethod(2, 3) == 5
    }

    @Unroll("inputs: #first and #second and result #result")
    //@Unroll made each iteration through the parametrized data separate to the outside world
    def "Let's use some parameterization"() {
        expect:
        businessObject.businessMethod(first, second) == result
        where:
        first | second | result
        1     | 2      | 10
        4     | 5      | 9
    }

    def "Broken test output representation"() {
        expect:
        businessObject.businessMethod(2, 3) == 10
    }


    def "Dummy empty test"() {
        given:
        when:
        expect:
        true;
    }


}
