import  org.junit.Test;
import java.util.List;
import java.util.ArrayList;

import static  org.junit.Assert.*;

public class jUnitTest {







      /*  @Test
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
        }*/


        @Test
        public  void verifyString(){
            String input1 = "codeup";
            String answer1 = "codeup";
            //assertion = (expected, actual)//
            assertEquals(input1,answer1);
        }


        @Test
        public  void verifyArrList() {
            List<String> language =  new ArrayList<>();
            List<String> moreLanguage = new ArrayList<>();
            assertNotSame(language,moreLanguage);
        }






        @Test

    public  void  verifyingArr() {

        }












    }







