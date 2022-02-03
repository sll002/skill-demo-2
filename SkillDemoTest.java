import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SkillDemoTest {
    @Test
    public void testOne(){
        final String EXPECTED_STRING = "SamuelLiu";
        //this is a failing test
        assertEquals("failing test", EXPECTED_STRING, SkillDemo.stringConcatenator("Samuel", "Liu")); //error in mismatched string
    }
}
