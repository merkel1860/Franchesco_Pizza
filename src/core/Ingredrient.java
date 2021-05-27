package core;

public class Ingredrient {
    private int idIngredient;
    private String name;
    private String description;
    private String proportion;

    public Ingredrient() {
    }

    public Ingredrient(int idIngredient, String name,
                       String description, String proportion) {
        this.idIngredient = idIngredient;
        this.name = name;
        this.description = description;
        this.proportion = proportion;
    }

    public int getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(int idIngredient) {
        this.idIngredient = idIngredient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProportion() {
        return proportion;
    }

    public void setProportion(String proportion) {
        this.proportion = proportion;
    }
}
