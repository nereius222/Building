public class Building implements iBuilding {
    private String address;
    private String city;
    private Apartment[] apartments;

    public Building(String address, String city, Apartment[] apartments) {
        this.address = address;
        this.city = city;
        this.apartments = apartments;
    }

    @Override
    public void showInfo() {
        System.out.println("Dirección: " + address + ". Ciudad: " + city);
        System.out.println("Apartamentos:");
        for (Apartment apartment : apartments) {
            apartment.showInfo();
        }
    }

    @Override
    public void showFloorApartments(int floor) {
        for (Apartment apartment : apartments) {
            if (apartment.getFloor() == floor) {
                apartment.showInfo();
            }
        }
    }

    // Building("calleFalsa", "Fuenlabrada", {Apartment(1, A),Apartment(1, B), Apartment(2, A), Apartment(2, B)})
    // floor=2, door="A"
    @Override
    public Apartment getApartment(String door, int floor) {
        Apartment found = null;
        for (Apartment apartment : apartments) {
            // 1ª iter apartment = Apartment(1, A) -> false
            // 2ª iter apartment = Apartment(1, B) -> false
            // 3ª iter apartment = Apartment(2, A) -> true; found = Apartment(2, A)
            // 4ª iter apartment = Apartment(2, B) -> false; found = Apartment(2, A)

            if (apartment.getFloor() == floor && apartment.getDoor().equals(door)) {
                found = apartment;
            }
        }
        // found = Apartment(2, A)
        return found;
    }

    @Override
    public Main[] getOwners(String door, int floor) {
        Apartment found = getApartment(door, floor);
        if(found !=  null) {
            // Si found es null, esto daría la excepción NullPointerException
            return found.getOwners();
        } else {
            return null;
        }

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return ;
    }

    @Override
    public int hashCode() {

    }
}