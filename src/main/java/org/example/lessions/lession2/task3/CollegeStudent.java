package org.example.lessions.lession2.task3;

public class CollegeStudent extends Student {
    private static String collegeName;
    private static int rating;
    private static long id;
    public static void constructCollege(String firstNameSet, String lastNameSet, int groupSet){
        setFirstName(firstNameSet);
        setLastName(lastNameSet);
        setGroup(groupSet);
    }
    public static void constructCollege(String lastNameSet, Course[] coursesTakenSet) {
        setLastName(lastNameSet);
        setCoursesTaken(coursesTakenSet);
    }
    public static void constructCollage(String collegeNameSet, int ratingSet, long idSet) {
        collegeName = collegeNameSet;
        rating = ratingSet;
        id = idSet;
    }
    //Setters

    public static void setCollegeName(String collegeName) {
        CollegeStudent.collegeName = collegeName;
    }

    public static void setRating(int rating) {
        CollegeStudent.rating = rating;
    }

    public static void setId(long id) {
        CollegeStudent.id = id;
    }
    //Getters

    public static String getCollegeName() {
        return collegeName;
    }

    public static int getRating() {
        return rating;
    }

    public static long getId() {
        return id;
    }
}
