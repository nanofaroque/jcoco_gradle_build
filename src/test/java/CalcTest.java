import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {
    private Calc calc;
    @Before
    public void  init(){
        calc=new Calc();
    }
    @Test
    public void when_two_ints_add_return_result(){
        int result= calc.add(10,12,'+');
        Assert.assertEquals(22,result);
    }

    @Test
    public void when_two_ints_sub_return_result(){
        int result= calc.add(12,10,'-');
        Assert.assertEquals(2,result);
    }
}
