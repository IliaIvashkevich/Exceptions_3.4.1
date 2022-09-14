import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Ваш логин:");
        String login = scanner.nextLine();
        System.out.println("Введите Ваш пароль:");
        String password = scanner.nextLine();

        User confirmedUser = getUserByLoginAndPassword(login, password);
        validateUser(confirmedUser);

        System.out.println(confirmedUser + " зашел на сайт");
    }

    public static User[] getUsers() {
        User user1 = new User("ilia", "4567", "ilia@gmail.com", 31);
        User user2 = new User("olha", "0987", "olha@gmail.com", 17);
        return new User[]{user1, user2};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return new User(user.getLogin(), user.getPassword(), user.getEmail(), user.getAge());
            }
        }
        throw new UserNotFoundException("Вами введен неверный логин или пароль!" + " Попробуйте еще раз!");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("Вход за сайт запрещен (Вам не исполнилось 18 лет)");
        }
    }
}
