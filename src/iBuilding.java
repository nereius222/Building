public interface iBuilding {
    void showInfo();

    void showFloorApartments(int floor);

    Apartment getApartment(String door, int floor);

    Main[] getOwners(String door, int floor);
}

