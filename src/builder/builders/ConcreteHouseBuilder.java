package builder.builders;

import builder.product.House;

public class ConcreteHouseBuilder implements HouseBuilder{
    private House house;

    public ConcreteHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Beton, mortier, gravillons, aciers");
        System.out.println("Concrete House Builder --> Foundation completed!");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Beton, mortier, gravillons, aciers");
        System.out.println("Concrete House Builder --> Structure completed!");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Matériaux pour toit, Aciers, Bois");
        System.out.println("Concrete House Builder --> Roof completed!");
    }

    @Override
    public void paintHouse() {
        house.setPainted(true);
        System.out.println("Concrete House Builder --> Painting completed!");
    }

    @Override
    public void furnishHouse() {
        house.setFurnished(true);
        System.out.println("Concrete House Builder --> Furnishing complete");
    }

    @Override
    public House getHouse() {
        System.out.println("Concrete House Builder: Concrete House complete!");
        return this.house;
    }
}
