package entities;

import javax.jws.WebService;

@WebService
public class Service {
    public int somme(int a,int b){
        return a+b;
    }
}
