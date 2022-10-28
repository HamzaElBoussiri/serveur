import entities.Service;

import javax.xml.ws.Endpoint;

public class Web {

    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8082/",new Service());
    }
}
