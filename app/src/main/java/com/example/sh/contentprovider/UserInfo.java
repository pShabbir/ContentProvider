package com.example.sh.contentprovider;

/**
 * Created by Shabbir Hussain on 6/6/2017.
 */

public class UserInfo {
    String name="John Doe";
    String phonenumber;

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public UserInfo(String name, String phonenumber) {
        this.name = name;
        this.phonenumber = phonenumber;
    }
}
