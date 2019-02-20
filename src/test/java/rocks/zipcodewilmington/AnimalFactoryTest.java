package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    @Test
    public void createDogTest(){
    //given
        String name = "Milo";
        Date birthdate = new Date();
    //when
        Dog dog = AnimalFactory.createDog(name, birthdate);
        String actualName = ((Dog) dog).getName();
        Date actualBirthDate = dog.getBirthDate();

    //then
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthdate, actualBirthDate);

    }
    @Test
    public void createCatTest(){
        //given
        String name = "HiMark";
        Date birthdate = new Date();
        //when
        Cat cat = AnimalFactory.createCat(name, birthdate);
        String actualName = ((Cat) cat).getName();
        Date actualBirthDate = cat.getBirthDate();

        //then
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthdate, actualBirthDate);

    }


}
