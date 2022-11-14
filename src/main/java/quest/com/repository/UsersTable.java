package quest.com.repository;

import quest.com.service.user.User;

public class UsersTable extends Table<User> {
    private static UsersTable instance = new UsersTable();

    public static UsersTable getInstance() {
        return instance;
    }

    private UsersTable() {}

    public User getUserByNameAndPassword(String name, String password) {
        return tableMap.values().stream()
                .filter(user -> name.equals(user.getName()) && password.equals(user.getPassword()))
                .findFirst()
                .orElse(null);
    }
}
