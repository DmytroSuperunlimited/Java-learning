package org.example.lessions.lession2.task3;

public class SpecialStudent extends CollegeStudent{
    private static long secretKey;
    private static String email;
    public static void ConstructSpetial(String collegeNameSet, int ratingSet, long idSet) {
        setCollegeName(collegeNameSet);
        setRating(ratingSet);
        setId(idSet);
    }
    public static void ConstructSpetial(long secretKeySet) {
        secretKey = secretKeySet;
    }
    //Setters
    public static void setEmail(String email) {
        SpecialStudent.email = email;
    }

    public static void setSecretKey(long secretKey) {
        SpecialStudent.secretKey = secretKey;
    }
    //Getters
    public static String getEmail() {
        return email;
    }

    public static long getSecretKey() {
        return secretKey;
    }
}
