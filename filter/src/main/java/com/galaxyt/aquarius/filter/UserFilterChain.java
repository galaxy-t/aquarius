package com.galaxyt.aquarius.filter;

import java.util.List;

public class UserFilterChain implements UserFilter {

    private UserFilter[] filters;

    public UserFilterChain(UserFilter ... filters) {
        this.filters = filters;
    }



    public List<User> filter(List<User> list) {

        List<User> newList = null;

        for (UserFilter filter : this.filters) {

            newList = filter.filter(list);

        }

        return newList;
    }
}
