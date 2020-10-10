package builder.builders;

import builder.product.House;

public class PrefabricatedHouseBuilder implements HouseBuilder{
    private House house;

    public PrefabricatedHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Bois, aciers");
        System.out.println("Prefabricated House Builder: Foundation completed!");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Boise, aciers et Panneaux de bois");
        System.out.println("Prefabricated House Builder: Structure completed!");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Bois, bardeaux");
        System.out.println("Prefabricated House Builder: Roof completed!");
    }

    @Override
    public void paintHouse() {
        house.setPainted(false);
        System.out.println("Prefabricated House Builder: Painting not required!");
    }

    @Override
    public void furnishHouse() {
        house.setFurnished(true);
        System.out.println("Prefabricated House Builder: Furnishing completed!");
    }

    @Override
    public House getHouse() {
        System.out.println("Prefabricated House BUilder: Prefabricated House done!");
        return this.house;
    }
}
