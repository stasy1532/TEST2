package user;

public class User {
    public String FirstName = "";
    public String LastName = "";
    public String email = "";
    public String password = "";
    public String mobile = "";
    public String phone = "";


    public User(String email,  String password){
        int at_position = -1;
        for(int i = 0 ; i <= email.length()-1; i++) {
            if(email.charAt(i) == '@') {
                at_position = email.charAt(i);
            }
        }

        if(at_position == -1) {
            System.out.println("No at in emal");
        } else {
            System.out.println("Contain at in emal");
        }

        this.email = email;

        if(password.length() < 8 ) {
            System.out.println("Less than 8");
        }
        if(password.length() > 16 ) {
            System.out.println("More than 16");
        }

        System.out.println("correct pass");

        this.password = password;
    };
    public User(
            String FirstName, String LastName, String email,
            String password,
            String mobile, String phone
    ){

        this.FirstName = FirstName;
        this.LastName = LastName;

        int at_position = -1;
        for(int i = 0 ; i <= email.length()-1; i++) {
            if(email.charAt(i) == '@') {
                at_position = email.charAt(i);
            }
        }

        if(at_position == -1) {
            System.out.println("No at in emal");
        } else {
            System.out.println("Contain at in emal");
        }

        this.email = email;

        if(password.length() < 8 ) {
            System.out.println("Less than 8");
        }
        if(password.length() > 16 ) {
            System.out.println("More than 16");
        }

        System.out.println("correct pass");

        this.password = password;

        this.mobile = mobile;
        this.phone = phone;
    };

    public String getEmail() {
        return email;
    }
}

