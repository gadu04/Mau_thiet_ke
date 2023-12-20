
import java.util.ArrayList;
import java.util.List;

public class Individual {
    private String name;
    private String birthDate;
    private String gender;
    private boolean isMarried;
    private List<Individual> children;

    // Constructor
    public Individual(String name, String birthDate, String gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.children = new ArrayList<>();
        this.isMarried = false;
    }

    // Add child
    public void addChild(Individual child) {
        children.add(child);
    }

    // Set marital status
    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    // Check if individual is single
    public boolean isSingle() {
        return !isMarried;
    }

    // Get children
    public List<Individual> getChildren() {
        return children;
    }

    // toString method for displaying individual information
    public String toString(){
        return ("Individual :[ Name : " + name + ", Birth Date : " + birthDate + ", Gender : " + gender + ", Married : " + isMarried + " ]");
    }
}
