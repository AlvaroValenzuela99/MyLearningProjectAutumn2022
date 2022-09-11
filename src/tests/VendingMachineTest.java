import org.junit.Assert;
import org.junit.Test;
import vending_machine.Beverage;
import vending_machine.Snack;

public class VendingMachineTest {

    @Test
    public void testCalculationOfCaloriesForSnack(){
        Snack snack = new Snack("snack", 250, 100);
        double expected = 250.2;
        double actual = snack.getCaloriesForSnack();
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testSetWeightForSnack(){
        Snack snack = new Snack();
        snack.setWeight(999.99);
        double expected = 999.99;
        double actual = snack.getWeight();
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testIsHot(){
        Beverage beverage = new Beverage("drink", true, false);
        boolean isHot = beverage.isHot();
        Assert.assertTrue(beverage.isHot());
    }
}
