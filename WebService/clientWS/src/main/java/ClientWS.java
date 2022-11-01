import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        //créer un middleware
        //grace à cet objet mon app peut communiquer facilement avec le web service
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        //exécuter une méthode du WS
        System.out.println(stub.convert(7600));
        Compte cp=stub.getCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}
