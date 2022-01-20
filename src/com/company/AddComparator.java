package com.company;

import java.util.Comparator;

public class AddComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAddress().equals(o2.getAddress()))
            return 1;
        else if (o1.getAdress() == o2.getAdress())
            return 0;
        else
            return -1;
    }
}
