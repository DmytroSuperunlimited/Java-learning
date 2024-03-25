package org.example.lessions.lession2.task3;

import java.util.Date;

public class Course {
        private static Date startDate = new Date();
        private static String name;
        private static int hoursDuration;
        private static String teacherName;
        public static void construct(Date startDateSet, String nameSet) {
                startDate = startDateSet;
                name = nameSet;
        }
        public static void construst(String nameSet, int hoursDurationSet, String teacherNameSet) {
                name = nameSet;
                hoursDuration = hoursDurationSet;
                teacherName = teacherNameSet;
        }
        //Setters
        public static void setStartDate(Date startDate) {
                Course.startDate = startDate;
        }

        public static void setName(String name) {
                Course.name = name;
        }

        public static void setHoursDuration(int hoursDuration) {
                Course.hoursDuration = hoursDuration;
        }

        public static void setTeacherName(String teacherName) {
                Course.teacherName = teacherName;
        }
        //Getters

        public static Date getStartDate() {
                return startDate;
        }

        public static String getName() {
                return name;
        }

        public static int getHoursDuration() {
                return hoursDuration;
        }

        public static String getTeacherName() {
                return teacherName;
        }
}

