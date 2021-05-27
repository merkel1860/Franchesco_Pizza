package core.model;

public class Dimesion {
    private String name;
    private float weight;
    private int idDimension;


    public Dimesion() {
    }

    public Dimesion(String name, float weight, int idDimension) {
        this.name = name;
        this.weight = weight;
        this.idDimension = idDimension;
    }

    public Dimesion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getIdDimension() {
        return idDimension;
    }

    public void setIdDimension(int idDimension) {
        this.idDimension = idDimension;
    }
}
