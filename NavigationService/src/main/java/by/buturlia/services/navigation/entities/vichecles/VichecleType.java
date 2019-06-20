package by.buturlia.services.navigation.entities.vichecles;

import java.util.Objects;

public class VichecleType {
    private int id;
    private int vichecleTypeame;



    @Override
    public String toString() {
        return "VichecleType{" +
                "vichecleTypeame=" + vichecleTypeame +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VichecleType)) return false;
        VichecleType that = (VichecleType) o;
        return getId() == that.getId() &&
                getVichecleTypeame() == that.getVichecleTypeame();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getVichecleTypeame());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVichecleTypeame() {
        return vichecleTypeame;
    }

    public void setVichecleTypeame(int vichecleTypeame) {
        this.vichecleTypeame = vichecleTypeame;
    }

    public VichecleType(int id, int vichecleTypeame) {
        this.id = id;
        this.vichecleTypeame = vichecleTypeame;
    }

    public VichecleType() {
    }
}
