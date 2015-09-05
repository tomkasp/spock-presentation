import spock.lang.Specification

class TestMyBusinessFunctions extends Specification{


    BusinessObject businessObject

    def setup(){
        businessObject = new BusinessObject();
    }

    def "Check some business method"(){
        expect:
        businessObject.businessMetod(2,3) == 5
    }

    def "Broken test output representation"(){
        expect:
        businessObject.businessMetod(2,3) == 10
    }


    def "Dummy empty test"(){
        given:
        when:
        expect:
        true;
    }



}
