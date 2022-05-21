package TestFactory;

import entities.Financing;

public class FinancingFactory {

    public static Financing createdFinancingOk(){
        return new Financing(100000.0, 2000.0, 80);
    }
    public static Financing createdFinancingException(){
        return new Financing(100000.0, 2000.0, 20);
    }

}
