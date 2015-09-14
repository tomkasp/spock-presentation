import spock.lang.Specification

class BlockExamples extends Specification {

    def "setup block"() {
        setup: "this is valid test spock"
        BusinessObject businessObject = new BusinessObject();
    }

    def " When and Then example"() {
        BusinessObject businessObject = new BusinessObject()
        //when and then always occur together
        when: "we invoke some me"
        int a = businessObject.businessMethod(2, 2)
        then:
        //conditions
        //exceptions
        //interactions (mocks cardinality)
        a == 5
        thrown(NullPointerException.class)
    }

    def "check out expect"() {
        expect:
        true
    }

    def "you can combined everything together"() {

        given: "sdf"
        List a = new ArrayList();

        when: "sdf"
        a.add(1)
        a.add(2)

        then: "sdf"
        a.size() == 2;

        expect: "sdf"
        a.get(0) + a.get(1) == 3
    }

    def "bonus!!! Welcome where block and parametrization"() {
        expect:
        a + b == result

        where:
        a | b | result
        1 | 2 | 3
        3 | 3 | 6
        3 | 2 | 6
    }
}
