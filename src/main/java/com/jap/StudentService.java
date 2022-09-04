package com.jap;

import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData(){
        //create six student object by calling Student class parameterized constructor
        Student student1 = new Student("xyz",1,100);
        Student student2= new Student("yxz",9,90);
        Student student3 = new Student("zxy",4,50);
        Student student4 = new Student("zyx",7,85);
        Student student5 = new Student("yzx",10,78);
        Student student6 = new Student("xzy",12,98);
        //create HashSet object and add all the students object inside it
        HashSet<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        studentSet.add(student5);
        studentSet.add(student6);
        //return the HashSet object
        return studentSet;
    }


    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet){
        //Create a TreeSet object
        TreeSet<String> studentTreeSet = new TreeSet<>();
        //Use Iterator object of type <Student> to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();
        while (iterator.hasNext()){
            Student element = iterator.next();
            //get all the name and add it inside the TreeSet object
            String name = element.getName();
            studentTreeSet.add(name);
        }
      //return the TreeSet object;
        return studentTreeSet;
    }

    public static Map<String,Integer> calculateAverage(Set<Student> studentSet){
        //create a HashMap object of type <String,Integer>
        HashMap<String,Integer> studentHashMap = new HashMap<>();
        //Use Iterator object of type <Student>to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();
        //retrieve the Student object from the iterator
        while (iterator.hasNext()){
            //add the student name and average marks in the HashMap object created in the
            Student element = iterator.next();
            //Use getter method to get TotalMarks of each student. calculate the average
            studentHashMap.put(element.getName(),element.getTotalMarks()/studentSet.size() );
        }
        //first line and return the map
           return studentHashMap;

    }

    public static void main(String[] args) {
        Set studentName = getAllStudentData();
        System.out.println(getAllStudentNameInSorted(studentName));
        System.out.println(calculateAverage(studentName));
    }


}
