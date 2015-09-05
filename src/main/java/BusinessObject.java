public class BusinessObject {

    public int businessMethod(int a, int b) {
            return a + b;
    }


    public void processPayment(int a, int b){
        businessMethod(a,b);
    }

}
