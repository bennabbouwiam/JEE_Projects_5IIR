import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

//déployer le web service
public class ServerJWS {
    public static void main(String[] args){
        //démarrer un serveur http avec un port pour utiliser le web service
        //localhost : le web service est consulter en local
        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
        System.out.println("web service est déployé sur http://0.0.0.0:9191/");
    }
}
