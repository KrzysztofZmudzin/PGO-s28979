package User;

public class User {
    private String name;
    private String lastName;
    private String eMail;
    private String password;
    private boolean guestAccount;

    public User(String eMail) {
        seteMail(eMail);
        setGuestAccount(true);
    }
    public User(String name, String lastName, String eMail, String password) {
        setName(name);
        setLastName(lastName);
        seteMail(eMail);
        setPassword(password);
        setGuestAccount(false);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name== null) {
            throw new IllegalArgumentException("Name can not be null");
        }
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName== null) {
            throw new IllegalArgumentException("Last name can not be null");
        }
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {

        if (eMail== null) {
            throw new IllegalArgumentException("E-mail can not be null");
        }
        if (!eMail.contains("@")) {
            throw new IllegalArgumentException("E-mail must contain '@'");
        }
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password== null) {
            throw new IllegalArgumentException("Password can not be null");
        }
        this.password = password;
    }

    public boolean isGuestAccount() {
        return guestAccount;
    }

    public void setGuestAccount(boolean guestAccount) {
        this.guestAccount = guestAccount;
    }

    public void checkAccount() {
        if (!guestAccount) {
            System.out.println("This is full account");
        }
        if (guestAccount) {
            System.out.println("This is guest account");
        }
    }
}
