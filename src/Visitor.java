public class Visitor extends User{

    public Visitor(String name, String id, int phone) {
        super(name, id, phone);
    }

    @Override
    public String toString() {
        return super.toString() + "Visitor{" + super.toString() + "}";
    }
}
