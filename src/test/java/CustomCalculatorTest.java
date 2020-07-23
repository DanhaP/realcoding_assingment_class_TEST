

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    //더하기 테스트 작성
    @Test
    public void addTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10,15);

        assertTrue(result==25);
        assertThat(result,is(25));
        System.out.println("result :: " + result);
    }
    //더하기 false 테스트
    @Test
    public void addFalseTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10,15);

        assertFalse(result == 25);
        System.out.println("result :: " + result);
    }

    //빼기 테스트 작성
    @Test
    public void subtractTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(23,10);

        assertTrue(result==13);
        System.out.println("result :: " + result);
    }
    //빼기 false 테스트
    @Test
    public void subtractFalseTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(23,10);
        assertFalse(result == 12);
    }

    //곱하기 테스트 작성
    @Test
    public void multiplyTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(5,9);

        assertThat(result, is(45));
        System.out.println("result :: " + result);
    }
    //곱하기 false 테스트
    @Test
    public void multiplyFalseTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(5,9);

        assertFalse(result == 12);
        System.out.println("result :: " + result);
    }

    //나누기 테스트 작성
    @Test
    public void divideTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(25,5);

        assertThat(result, is(5));
        System.out.println("result :: " + result);
    }
    //나누기 flase 테스트
    @Test
    public void divideFalseTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(25,5);

        assertFalse(result==5);
        System.out.println("result :: " + result);
    }
    //시간제한 실패 test
    @Test(timeout = 4000)
    public void timeInMethodTest() throws InterruptedException{
        Thread.sleep(5000);
    }
    //시간제한 성공 test
    @Test(timeout = 3000)
    public void 시간제한체크() throws InterruptedException{
        Thread.sleep(2000);
    }
    //exception이 기대하는 것이 맞는지 test
    @Test(expected = IndexOutOfBoundsException.class)
    public void testIsEmptyindexOutOfBoundException(){
        new ArrayList<Object>().get(0);
    }


    @Test
    public void testMethod(){
        ArrayList<Object> myList = new ArrayList<Object>();
        assertThat(myList, is(empty()));
    }

    @Test
    public void isEmptyArray(){
        ArrayList<Object> myList = new ArrayList<>();
        assertThat(myList, is(empty()));
    }
}