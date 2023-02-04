package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {
    @Test
    public  void testSayNumber() {
        Solution obj = new Solution();
        // assertEquals("Zero.", obj.sayNumber(0));
        // assertEquals("Eleven .", obj.sayNumber(11));
        // assertEquals("One Million and Forty Three Thousand and Two Hundred Eighty Three .", obj.sayNumber(1043283));
        // assertEquals("Ninety  Trillion and Three Hundred Seventy Six Billion and Ten Thousand and Twelve .", obj.sayNumber(90376000010012L));
        assertEquals(obj.sayNumber(0), "Zero.");
        assertEquals(obj.sayNumber(11), "Eleven.");
        assertEquals(obj.sayNumber(14), "Fourteen.");
        assertEquals(obj.sayNumber(15), "Fifteen.");
        assertEquals(obj.sayNumber(43), "Forty-three.");
        assertEquals(obj.sayNumber(50), "Fifty.");
        assertEquals(obj.sayNumber(1001), "One thousand and one.");
        assertEquals(obj.sayNumber(20000), "Twenty thousand.");
        assertEquals(obj.sayNumber(1033286), "One million, thirty-three thousand, two hundred and eighty-six.");
        assertEquals(obj.sayNumber(12000013), "Twelve million and thirteen.");
        assertEquals(obj.sayNumber(90376000010012L), "Ninety trillion, three hundred and seventy-six billion, ten thousand and twelve.");
    }
   
}
