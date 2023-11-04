package service;

@webService(name="CalculatriceWS")
public class CalculatriceWS {
	
	@WebMethod(operationName="somme")
    public static  int somme(@WebParam(name="a") int a, @WebParam(name="b") int b) {
    	return a+b;
    }
     public static void main(String [] args) {
    	 System.out.print("la somme est :" +somme(4,8));
     }

}
