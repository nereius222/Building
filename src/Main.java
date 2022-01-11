public class Main {
    Owner[] owners1 = {
            new Owner("Peppa", "Pig"),
            new Owner("George", "Pig")
    };
    Owner[] owners2 = {
            new Owner("Bob", "Esponja")
    };
    Apartment[] apartments = {
            new Apartment(1, "A", owners2),
            new Apartment(1, "B", owners1),
            new Apartment(2, "A", owners2),
            new Apartment(2, "B", owners1),
    };
    Building building1 = new Building("Calle Falsa, 3", "Fuenlabrada", apartments);
        building1.showInfo();

    Building building2 = new Building("Calle Otra, 2", "Leganés", apartments);
        building2.showInfo();
}
