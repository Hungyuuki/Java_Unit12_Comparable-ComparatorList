package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Kien", 30, "Hà Nội");
        Student student2 = new Student("Nam", 26, "TP.Hồ Chí Minh");
        Student student3 = new Student("Anh", 38, "Quảng Ninh");
        Student student4 = new Student("Tung", 38, "Hà Tĩnh");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sánh theo tuoi:");
        for (Student st : lists) {
            System.out.println(st.toString());
        }

        AddComparator addComparator = new AddComparator();
        Collections.sort(lists, addComparator);
        System.out.println("So sánh theo địa chỉ:");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}