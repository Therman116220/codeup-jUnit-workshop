import  org.junit.Test;
import static  org.junit.Assert.*;



public  class jUnitTests {

    @Test
    public  void testIfNameIsSTherman(){
        String thing1 = "Therman";
        String thing2 = "Haynes";
        //assertion = (expected, actual)//
        assertEquals(thing1,thing2);

    }




    @Test
    public void testIfChangeIsCorrect() {

        double price = 10.0;
        double discount = 4.5;

        assertEquals(5.5, price-discount, 0.5);
        assertNotEquals(4.2,price-discount, 0.5);


    }





}