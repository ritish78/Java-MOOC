
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.liNumber);
        hash = 29 * hash + Objects.hashCode(this.country);
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof LicensePlate)){
            return false;
        }
        LicensePlate licenseObj = (LicensePlate) obj;
        if (this.country.equals(licenseObj.country) &&
                this.liNumber.equals(licenseObj.liNumber)){
            return true;
        }
        return false;
    }
}
