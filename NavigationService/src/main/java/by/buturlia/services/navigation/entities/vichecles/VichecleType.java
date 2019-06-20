package by.buturlia.services.navigation.entities.vichecles;

import java.util.Objects;

public class VichecleType {
    private int id;
    private int vichecleTypename;



    @Override
    public String toString() {
        return "VichecleType{" +
                "vichecleTypename=" + vichecleTypename +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VichecleType)) return false;
        VichecleType that = (VichecleType) o;
        return getId() == that.getId() &&
                getVichecleTypename() == that.getVichecleTypename();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getVichecleTypename());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVichecleTypename() {
        return vichecleTypename;
    }

    public void setVichecleTypename(int vichecleTypename) {
        this.vichecleTypename = vichecleTypename;
    }

    public VichecleType(int id, int vichecleTypename) {
        this.id = id;
        this.vichecleTypename = vichecleTypename;
    }

    public VichecleType() {
    }
}
