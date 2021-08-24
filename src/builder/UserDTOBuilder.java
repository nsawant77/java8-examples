package builder;

import java.time.LocalDate;

//Abstract builder
public interface UserDTOBuilder {

    UserDTOBuilder withFirstName(String fname);

    UserDTOBuilder withLastName(String lname);

    UserDTOBuilder withBirthDate(LocalDate date);

    UserDTOBuilder withAddress(Address address);

    //To assemble and construct a DTO object
    UserDTO build();

}
