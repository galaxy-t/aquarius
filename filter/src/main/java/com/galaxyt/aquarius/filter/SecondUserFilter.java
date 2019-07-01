package com.galaxyt.aquarius.filter;

import java.util.ArrayList;
import java.util.List;

public class SecondUserFilter implements UserFilter {


    public List<User> filter(List<User> list) {

        List<User> newList = new ArrayList<User>();

        for (User user : list) {

            if (user.getAge() > 20 && user.getAge() < 30) {
                newList.add(user);
            }

        }

        return newList;

    }


}
