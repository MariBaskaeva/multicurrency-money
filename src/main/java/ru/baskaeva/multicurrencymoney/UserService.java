package ru.baskaeva.multicurrencymoney;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class UserService {

    public Map<String, Integer> getRoles(List<User> userList) {
        Map<String, Integer> map = new HashMap<>();

        for (User user : userList) {
            for (Role role : user.getRoles()) {
                var name = role.getName();
                map.put(name, map.getOrDefault(name, 0) + 1);
            }
        }

        return map;
    }

    public Map<String, Long> getUniqueRoles(List<User> userList) {
        return userList.stream()
                .flatMap(user -> user.getRoles().stream())
                .collect(Collectors.groupingBy(Role::getName, counting()));
    }
}
