package za.ac.cput.domain.generic;

/* MobileGlow Car Wash
   Address
   Author: Inga Zekani (221043756)
 */

public class Address {

    private String addressID;
    private String streetNumber;
    private String streetName;
    private String city;
    private String postalCode;

    //Default Constructors
    public Address() {

    }

    private Address(Builder builder) {
        this.addressID = builder.addressID;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.city = builder.city;
        this.postalCode = builder.postalCode;
    }

    public String getAddressID() {
        return addressID;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressID='" + addressID + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public static class Builder {

        private String addressID;
        private String streetNumber;
        private String streetName;
        private String city;
        private String postalCode;

        public Builder setAddressID(String addressID) {
            this.addressID = addressID;
            return this;
        }

        public Builder setStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;

        }

        public Builder copy(Address address) {
            this.addressID = address.addressID;
            this.streetNumber = address.streetNumber;
            this.streetName = address.streetName;
            this.city = address.city;
            this.postalCode = address.postalCode;
            return this;
        }
        public Address build() {
            return new Address(this);
        }
    }

}
