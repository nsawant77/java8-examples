package builder;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {

        UserDTOBuilder builder = new UserDTOConcreteBuilder();
        User user = createUser();
        System.out.println(Client.directBuild(builder,user));
    }

    public static UserDTO directBuild(UserDTOBuilder builder, User user){
        return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
                .withAddress(user.getAddress()).withBirthDate(user.getBirthday())
                .build();
    }

    public static User createUser(){
        User user = new User();

        user.setFirstName("Nilesh");
        user.setLastName("Sawant");
        user.setBirthday(LocalDate.of(1989,10,04));

        Address address = new Address();
        address.setStreet1("F2-1002, Nyati Elan");
        address.setStreet2("Opp. Link road");
        address.setCity("Mumbai");
        address.setState("Maharashta");
        address.setZip(400091);
        user.setAddress(address);
        return user;
    }
}
