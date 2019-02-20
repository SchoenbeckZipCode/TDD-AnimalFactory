package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {


    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    @Test
    public void testAdd(){
        //given
        Dog expected = new Dog(null, null, 5);
        Integer id = expected.getId();
        //when
        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(id);

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeTest(){
        //given
        int id = 10;
        Dog dog = new Dog(null, null, id);

        DogHouse.add(dog);
        Dog dogFromDogHouse = DogHouse.getDogById(id);
        Assert.assertNotNull(dogFromDogHouse);
        //when
        DogHouse.remove(id);
        Dog actual = DogHouse.getDogById(id);
        //then
        Assert.assertNull(actual);

    }
}
