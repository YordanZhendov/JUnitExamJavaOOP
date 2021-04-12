package aquarium;

import org.junit.Assert;
import org.junit.Test;


public class AquariumTests {



    @Test
    public void  con(){
        Aquarium aquarium=new Aquarium("F", 5);
        Assert.assertEquals(0,aquarium.getCount());
    }

    @Test(expected = NullPointerException.class)
    public void testSetName(){
        Aquarium aquarium=new Aquarium(null,6);
    }
    @Test(expected = NullPointerException.class)
    public void testName(){
        Aquarium aquarium=new Aquarium("  ",6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setCapacity(){
        Aquarium aquarium=new Aquarium("Gos",-2);
    }

    @Test
    public void getCapacity(){
        Aquarium aquarium=new Aquarium("Gos",5);
        Assert.assertEquals(5,aquarium.getCapacity());
    }

    @Test
    public void getName(){
        Aquarium aquarium=new Aquarium("Gos",5);
        Assert.assertEquals("Gos",aquarium.getName());
    }


    @Test
    public void countFish(){
        Aquarium aquarium=new Aquarium("g",6);
        Fish fish=new Fish("Gaga");
        aquarium.add(fish);
        Assert.assertEquals(1,aquarium.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeFish(){
        Aquarium aquarium=new Aquarium("g",6);
        Fish fish=new Fish("Gaga");
        aquarium.add(fish);
        aquarium.remove("Fego");
    }

    @Test(expected = IllegalArgumentException.class)
    public void findFish(){
        Aquarium aquarium=new Aquarium("g",6);
        Fish fish=new Fish("Gaga");
        aquarium.sellFish("F");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullFish(){
        Aquarium aquarium=new Aquarium("g",6);
        Assert.assertNull(aquarium.sellFish("F"));
    }

    @Test
    public void testSetAvail(){
        Aquarium aquarium=new Aquarium("g",6);
        Fish fish=new Fish("Gaga");
        aquarium.add(fish);
        aquarium.sellFish("Gaga");
        Assert.assertFalse(fish.isAvailable());
    }

    @Test
    public void report(){
        Aquarium aquarium=new Aquarium("g",6);
        Fish fish=new Fish("Gaga");
        Fish fish1=new Fish("Pesho");
        aquarium.add(fish);
        aquarium.add(fish1);
        Assert.assertEquals("Fish available at g: Gaga, Pesho",aquarium.report());

    }

    @Test(expected = IllegalArgumentException.class)
    public void fullAua(){
        Aquarium aquarium=new Aquarium("F", 2);
        Fish fish=new Fish("Gosoh");
        Fish fis1=new Fish("Eefe");
        Fish fish2=new Fish("Pefe");
        aquarium.add(fish);
        aquarium.add(fis1);
        aquarium.add(fish2);
    }




}

