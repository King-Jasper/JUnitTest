package com.example.lamdaarrays;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student david = new Student(12, 79.87f);
        Student joseph = new Student(5, 90.56F);
        Student michael = new Student(2, 60.87f);
        Student christian = new Student(4, 50.56F);
        Student james = new Student(6, 45.87f);
        Student[] list = {david, joseph, michael, christian, james};
        System.out.println(list);
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.marks - o2.marks);
            }


//       if(david.compareTo(joseph)<0){
//           System.out.println(david.compareTo(joseph));
//           System.out.println("Joseph has more mark");
//       }

        });
        System.out.println(Arrays.toString(list));
    }
}