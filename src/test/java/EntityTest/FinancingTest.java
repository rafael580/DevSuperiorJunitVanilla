package EntityTest;

import TestFactory.FinancingFactory;
import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTest {

    @Test
    public void constructorShouldCreatedWhenInstaceObject(){
        Financing financing = FinancingFactory.createdFinancingOk();

        Assertions.assertEquals(100000.0,financing.getTotalAmount());
        Assertions.assertEquals(2000.0,financing.getIncome());
        Assertions.assertEquals(80,financing.getMonths());
    }
    @Test
    public void constructorShouldThrowExceptionWhenInstaceObject(){
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            Financing financing = FinancingFactory.createdFinancingException();
        });
    }

    @Test
    public void  amountShouldValueWhenValidValue(){
        Financing financing = FinancingFactory.createdFinancingOk();
        double value = 50000.0;
        financing.setTotalAmount(value);
        Assertions.assertEquals(value,financing.getTotalAmount());
    }

    @Test
    public void amountShouldThrowExceptionWhenInalidValue(){
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            Financing financing = FinancingFactory.createdFinancingOk();
            double value = 5000000.0;
            financing.setTotalAmount(value);
        });
    }

    @Test
    public void  incomeShouldValueWhenValidValue(){
        Financing financing = FinancingFactory.createdFinancingOk();
        double value = 200000.0;
        financing.setIncome(value);
        Assertions.assertEquals(value,financing.getIncome());
    }
    @Test
    public void incomeShouldThrowExceptionWhenInalidValue(){
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            Financing financing = FinancingFactory.createdFinancingOk();
            double value = 500.0;
            financing.setIncome(value);
        });
    }
    @Test
    public void  monthsShouldValueWhenValidValue(){
        Financing financing = FinancingFactory.createdFinancingOk();
        int value = 200;
        financing.setMonths(value);
        Assertions.assertEquals(value,financing.getMonths());
    }
    @Test
    public void monthsShouldThrowExceptionWhenInalidValue(){
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            Financing financing = FinancingFactory.createdFinancingOk();
            int value = 2;
            financing.setMonths(value);
        });
    }
    @Test
    public void  entryShouldValueWhenValidValue(){
        Financing financing = FinancingFactory.createdFinancingOk();
        Double value = 20000.0;
        Assertions.assertEquals(value,financing.entry());
    }
    @Test
    public void  quotaShouldValueWhenValidValue(){
        Financing financing = FinancingFactory.createdFinancingOk();
        Double value = 1000.0;
        Assertions.assertEquals(value,financing.quota());
    }
}
