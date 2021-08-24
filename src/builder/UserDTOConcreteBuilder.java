package builder;

import java.time.LocalDate;
import java.time.Period;

public class UserDTOConcreteBuilder implements UserDTOBuilder{

    private String fname;
    private String lname;
    private String age;
    private String address;
    private UserDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        this.fname = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.lname = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthDate(LocalDate date) {
        Period period = Period.between(date, LocalDate.now());
        age = Integer.toString(period.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getStreet1() + " "+ address.getStreet2()
                        +"\n"+address.getCity()+ " "+ address.getState()
                        +"\n"+address.getZip();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserDTO(fname + " " +lname, address, age);
        return dto;
    }
}
