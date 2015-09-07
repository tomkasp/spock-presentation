import spock.lang.Specification

class BlockExamples extends Specification {

    def "setup block"() {
        setup: "this is valid test spock"
        BusinessObject businessObject = new BusinessObject();
    }

    def " When and Then example"() {
        BusinessObject businessObject = new BusinessObject()
        //when and then always occur together
        when:
        int a = businessObject.businessMethod(2, 2)
        then:
        //conditions
        //exceptions
        //interactions (mocks cardinality)
        a == 4
        thrown(NullPointerException.class)
    }

    def "check out expect"() {
        expect:
        true
    }

    def "you can combined everything together"() {

        given:
        List a = new ArrayList();

        when:
        a.add(1)
        a.add(2)

        then:
        a.size() == 2;

        expect:
        a.get(0) + a.get(1) == 3
    }

    def "bonus!!! Welcome where block and parametrization"() {
        expect:
        a + b == result

        where:
        a | b | result
        1 | 2 | 3
    }
}
