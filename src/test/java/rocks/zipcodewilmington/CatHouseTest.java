package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    @Before
    public void setup(){

    }


    @Test
    public void testAdd(){
        //given
        Cat expected = new Cat(null, null, 5);
        Integer id = expected.getId();
        //when
        CatHouse.add(expected);
        Cat actual = CatHouse.getCatById(id);

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeTest(){
        //given
        int id = 10;
        Cat cat = new Cat(null, null, id);

        CatHouse.add(cat);
        Cat catFromCatHouse = CatHouse.getCatById(id);
        Assert.assertNotNull(catFromCatHouse);
        //when
        CatHouse.remove(id);
        Cat actual = CatHouse.getCatById(id);
        //then
        Assert.assertNull(actual);

    }

    @Test
    public void removeByCatTest(){
        //given
        int id = 10;
        Cat cat = new Cat(null, null, id);

        CatHouse.add(cat);
        Cat catFromCatHouse = CatHouse.getCatById(id);
        Assert.assertNotNull(catFromCatHouse);
        //when
        CatHouse.remove(id);
        Cat actual = CatHouse.getCatById(id);
        //then
        Assert.assertNull(actual);

    }



    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
}
