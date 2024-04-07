package org.example.lessions.lession2.task3;

public class SpecialStudent extends CollegeStudent{

    private static long secretKey;

    private static String email;

    public static void ConstructSpetial(String collegeName, int rating, long id) {
        setCollegeName(collegeName);
        setRating(rating);
        setId(id);
    }

    public void ConstructSpetial(long secretKey) {
        this.secretKey = secretKey;
    }
    //Setters

    public void setEmail(String email) {
        this.email = email;
    }


    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }
    //Getters

    public static String getEmail() {
        return email;
    }

    public static long getSecretKey() {
        return secretKey;
    }
}
