package client;
import proxy.CalculWS;
import proxy.CalculWSService;
public class ClientWS {
	public static void main(String[] args) {
        CalculWS proxy = new CalculWSService().getCalculWSPort();
        int result = proxy.somme(5, 3); 
        System.out.println("Result: " + result);
    }
}
