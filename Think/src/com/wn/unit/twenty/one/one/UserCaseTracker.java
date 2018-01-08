package com.wn.unit.twenty.one.one;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by nengwei on 2018/1/7.
 */
public class UserCaseTracker {

    public static void trackUseCases(List<Integer> userCases, Class<?> cl) {
        for (Method m : cl.getDeclaredMethods()) {
            UseCase uc = m.getAnnotation(UseCase.class);
            if (uc != null) {
                System.out.println("Found use case :" + uc.id() + " " + uc.description());
                userCases.remove(new Integer(uc.id()));
            }
        }

        for (int i : userCases) {
            System.out.println("Warning: Missing use case-" + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<Integer>();
        Collections.addAll(useCases, 47, 48, 49, 50);
        trackUseCases(useCases, PasswordUtil.class);
    }
}
