package com.galaxyt.aquarius.filter;

import java.util.ArrayList;
import java.util.List;

public class FirstUserFilter implements UserFilter {

    public List<User> filter(List<User> list) {

        List<User> newList = new ArrayList<User>();

        for (User user : list) {

            if (user.getAge() > 10 && user.getAge() < 20) {
                newList.add(user);
            }

        }

        return newList;
    }
}
