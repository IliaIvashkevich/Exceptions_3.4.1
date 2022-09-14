public class User {
    String login;
    String password;
    String email;
    int age;

    public User(String login, String password, String email, int age) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Пользователь " + login + " [" + age + " лет]" + " email: " + email;
    }
}
