import user.User;
import user.Derived;

public class Main {
    public static void main(String[] args) {


        User new_usr = new User("aoksd@dfsdfs", "11111111111111232");
        User new_usr_allfields = new User("First", "Last", "aoksd@dfsdfs", "12345678", "2", "3" );
        Derived derived_user = new Derived("asdas@ada", "11111111", 20, 20000);
        derived_user.salaryUp();

        System.out.println(derived_user.getSalary());
        System.out.println(derived_user.getEmail());

    }
}
