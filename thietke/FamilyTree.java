public class FamilyTree {
    public static void main(String[] args) {
        // Creating individuals
        Individual james = new Individual("James", "1970-01-01", "Male");
        Individual hana = new Individual("Hana", "1972-05-12", "Female");

        james.setMarried(true);
        hana.setMarried(true);

        Individual ryan = new Individual("Ryan", "1995-03-15", "Male");
        Individual kai = new Individual("Kai", "1997-07-21", "Male");

        james.addChild(ryan);
        james.addChild(kai);
    }
}
