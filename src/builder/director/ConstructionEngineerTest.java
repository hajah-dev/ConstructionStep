package builder.director;

import builder.builders.ConcreteHouseBuilder;
import builder.builders.HouseBuilder;
import builder.builders.PrefabricatedHouseBuilder;
import builder.product.House;

public class ConstructionEngineerTest {
    public void testConstructionHouse() throws Exception{
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        HouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        ConstructionEngineer me = new ConstructionEngineer(concreteHouseBuilder);
        House houseFirst = me.constructHouse();
        System.out.println("First House: "+houseFirst);
        System.out.println("****************************");
        ConstructionEngineer you = new ConstructionEngineer(prefabricatedHouseBuilder);
        House houseSecond = you.constructHouse();
        System.out.println("Second House "+houseSecond);
    }

    public static void main(String[] args) throws Exception {
        new ConstructionEngineerTest().testConstructionHouse();
    }
}
