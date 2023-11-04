package serveur;

import service.CalculatriceWS;

public class ServeurJWS {
    public static void main(String [] args) {
    	//Spécifier l'@ d'accès
    	String url="http://localhost:8686/";
    	//Publier le WS, on fait appel à la méthode appartement à JAX-WS
    	//on publie le SW dans l'url et le SW est une instance de CalculWS
    	Endpoint.publish(url, new CalculatriceWS());
    	//pour le test
    	System.out.println(url);
    }
}
