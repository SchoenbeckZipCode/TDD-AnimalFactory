package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    Cat cat = new Cat(null, null, null);


    @Test
    public void setNameTest() {
        //given

        String expected = "Zula";

        //when
        cat.setName(expected);
        String actual = cat.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBirthDate() {

    }

    @Test
    public void getNumberOfMealsEaten() {
    }

    @Test
    public void eatTest() {

        //given

        int preMealCount = cat.getNumberOfMealsEaten();
        int postMealCount = preMealCount;
        int expected = preMealCount;
        //when
        Food food = new Food();
        cat.eat(food);
        //then
        Assert.assertEquals(expected, postMealCount);
    }


    @Test
    public void speakTest() {
        //given

        String expected = "meow!";
        //when
        String actual = cat.speak();
        //then
        Assert.assertEquals(expected, actual);


    }
@Test
    public void testAnimalInheritance(){

        //given

        boolean expected = true;
        //when
        boolean actual = cat instanceof Animal;
        //then
        Assert.assertEquals(expected, actual);

    }


    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`



    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
