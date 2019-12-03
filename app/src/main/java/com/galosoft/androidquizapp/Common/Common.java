package com.galosoft.androidquizapp.Common;

import com.galosoft.androidquizapp.Model.Question;
import com.galosoft.androidquizapp.Model.User;

import java.util.ArrayList;
import java.util.List;

public class Common {

    public static String categoryId, categoryName;
    public static User currentUser;

    public static List<Question> questionList = new ArrayList<>();

    public static final String STR_PUSH = "pushNotification";

}
