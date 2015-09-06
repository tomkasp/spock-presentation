import spock.lang.Specification

class MockingExample extends Specification {

    BusinessObject businessObject

    def setup(){
        businessObject = Mock(BusinessObject)
    }

    def "test behaviour"(){
        when: "process payment"
        businessObject.processPayment(1,2)

        then: "business method is being called"
        1 * businessObject.processPayment(1,2)
        0 * businessObject.processPayment(_,_)
    }

}
