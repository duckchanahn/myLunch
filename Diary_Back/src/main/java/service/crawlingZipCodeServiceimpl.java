package service;

public class crawlingZipCodeServiceimpl implements crawlingZipCodeService{
    @Override
    public String addressTozipCode(String address) {

        String zipcode = "";

        zipcode = this.getZipcode(address);

        return zipcode;
    }

    private String getZipcode(String address) {
        String zipcode = "";



        return zipcode;
    }

}
