package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    Dog dog = new Dog(null,null,null);

    @Test
    public void eatTest() {

        //given

        int preMealCount = dog.getNumberOfMealsEaten();
        int postMealCount = preMealCount;
        int expected = preMealCount;
        //when
        Food food = new Food();
        dog.eat(food);
        //then
        Assert.assertEquals(expected, postMealCount);
    }

    @Test
    public void speakTest() {
        //given

        String expected = "bark!";
        //when
        String actual = dog.speak();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testAnimalInheritance(){

        //given

        boolean expected = true;
        //when
        boolean actual = dog instanceof Animal;
        //then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void constructorTest() {
        // Given
        String givenName = "Doggy";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `Integer getId()`

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
