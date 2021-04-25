package at.fhj.iit;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * TeaTest
 * testing my own tea class
 * @author Andrea Hessler
 * Last Change: 24.04.21, 18:51
 **/

public class TeaTest {
    private Tea tea = new Tea();
    Liquid lt = new Liquid("Rum", 0.125, 43);

    @BeforeAll
    public static void setupAll() {
        System.out.println("--- BEGIN --- Test of the class Tea from Andrea Hessler");
    }
    //proof if the expected output = the actual output --> use assertions
    @Test
    @DisplayName("should create alcoholic tea")
    public void shouldCreateAlcTea() {
        tea.addTea("Black Tea with Rum", lt);
        assertFalse(tea.getAllTeas().isEmpty());            //proof if list is empty, assert: false
        assertEquals(1, tea.getAllTeas().size());   //proof if exact one element is in the list, assert : 1 is equal the size of the list
    }

    @Test
    @DisplayName("shouldn't create tea when name is null")
    public void shouldThrowExceptionWhenNameIsNull() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            tea.addTea(null, lt);
        });
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.println("---  END  --- Test of the class Tea");
    }
}
