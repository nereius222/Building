import java.util.Arrays;
import java.util.Objects;

public class Apartment {
    private int floor;
    private String door;
    private Main[] owners;

    public Apartment(int floor, String door, Main[] owners) {
        this.floor = floor;
        this.door = door;
        this.owners = owners;
    }

    public void showInfo() {
        System.out.println("       Planta: " + floor + ". Puerta: " + door);
        System.out.println("       Propietarios: ");
        for (Main owner : owners) {
            owner.showInfo();
        }
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public Main[] getOwners() {
        return owners;
    }

    public void setOwners(Main[] owners) {
        this.owners = owners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return getFloor() == apartment.getFloor() && Objects.equals(getDoor(), apartment.getDoor()) && Arrays.equals(getOwners(), apartment.getOwners());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFloor(), getDoor());
        result = 31 * result + Arrays.hashCode(getOwners());
        return result;
    }


}
