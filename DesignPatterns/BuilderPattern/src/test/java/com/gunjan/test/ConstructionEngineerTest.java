package com.gunjan.test;

import com.gunjan.builders.ConcreteHouseBuilder;
import com.gunjan.builders.HouseBuilder;
import com.gunjan.builders.PrefabricatedHouseBuilder;
import com.gunjan.director.ConstructionEngineer;
import com.gunjan.product.House;

public class ConstructionEngineerTest
{
    
    public static void main(String[] args) throws Exception
    {
        new ConstructionEngineerTest().testConstructHouse();
    }
    
    public void testConstructHouse() throws Exception
    {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("House is: " + houseA);
        PrefabricatedHouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
        House houseB = engineerB.constructHouse();
        System.out.println("House is: " + houseB);
    }
}