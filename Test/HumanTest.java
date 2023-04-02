import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    @Test
    public void getNameTest() {
        Human h = new Human("vardas", "pavarde", 35);
        String expected = "vardas";
        assertEquals(expected, h.getName());
    }

    @Test
    public void setNameTest() {
        Human h = new Human();
        h.setName("Saule");
        String expected = "Saule";
        assertEquals(expected, h.getName());
    }

    @Deprecated
    @Test
    @Ignore
    public void setNamePascalCaseOneWordTest() {
        Human h = new Human();
        h.setName("saule");
        String expected = "Saule";
        assertEquals(expected, h.getName());
    }

    @Test
    public void setNamePascalCaseTwoWordTest() {
        Human h = new Human("name", "surname" ,35);
        h.setName("saule keraite");
        String expected = "Saule Keraite";
        assertEquals(expected, h.getName());
    }

    @Test
    public void setNameTrimTest() {
        Human h = new Human();
        h.setName("    Saule ");
        String expected = "Saule";
        assertEquals(expected, h.getName());
    }
    @Test
    public void setNameEmptyTest() {
        Human h = new Human();
        h.setName("");
        String expected = "Name cannot be empty";
        assertEquals(expected, h.getName());
    }
    @Test
    public void setNameMultiplesSpacesTest() {
        Human h = new Human();
        h.setName("Saule      Keraite");
        String expected = "Saule Keraite";
        assertEquals(expected, h.getName());
    }



    //
//    @Test
//    public void getSurnameTest() {
//        Human h = new Human("vardas", "pavarde", 35);
//        String expected = "pavarde";
//        assertEquals(expected, h.getSurname());
//    }
//
//    @Test
//    public void setSurnameTest() {
//        Human h = new Human("vardas", "pavarde", 35);
//        h.setName("Keraite");
//        String expected = "Keraite  ";
//        assertEquals(expected, h.getSurname());
//    }
//
//    @Test
//    public void setSurnameOneWordTest() {
//        Human h = new Human("vardas", "pavarde", 35);
//        h.setName("keraite");
//        String expected = "Keraite";
//        assertEquals(expected, h.getSurname());
//    }
//
//    @Test
//    public void setSurnamePascalCaseTwoWordTest() {
//        Human h = new Human("vardas", "pavarde", 35);
//        h.setName("keraite - pauliene");
//        String expected = "Keraite - Pauliene";
//        assertEquals(expected, h.getSurname());
//    }
//
//    @Test
//    public void setSurnameTrimTest() {
//        Human h = new Human("vardas", "pavarde", 35);
//        h.setName("    Keraite ");
//        String expected = "Keraite";
//        assertEquals(expected, h.getSurname());
//    }
//

    @Test
    public void getAgeTest(){
        Human h = new Human("Algis", "Kazlausaks", 67);
        assertEquals(67, h.getAge());
    }
    @Test
    public void setAgeTest() {
        Human h = new Human();
        h.setAge(67);
        assertEquals(67, h.getAge());
    }

    @Test
    public void setMinusNumberAgeTest() {
        Human h = new Human();
        h.setAge(-35);
        assertEquals(0, h.getAge());
    }

    @Test
    public void setOver150AgeTest() {
        Human h = new Human();
        h.setAge(1500);
        assertEquals(150, h.getAge());
    }


}