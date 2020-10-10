package builder.product;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean furnished;
    private boolean painted;

    public void setFoundation(String foundation){
        this.foundation = foundation;
    }

    public void setStructure(String structure){
        this.structure = structure;
    }

    public void setRoof(String roof){
        this.roof = roof;
    }

    public void setFurnished(boolean furnished){
        this.furnished = furnished;
    }

    public void setPainted(boolean painted){
        this.painted = painted;
    }

    public String toString(){
        return "\tFoundation - " + foundation + "\n\tStructure - " + structure + "\n\tRoof - " + roof + "\n\t Is Furnished? "+
                furnished + "\n\tIs Painted? "+painted;
    }
}
