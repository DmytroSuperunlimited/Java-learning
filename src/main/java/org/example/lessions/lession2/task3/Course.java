package org.example.lessions.lession2.task3;

import java.util.Date;

public class Course {

        private static Date startDate = new Date();
        private static String name;
        private static int hoursDuration;
        private static String teacherName;

        public void construct(Date startDate, String name) {
                this.startDate = startDate;
                this.name = name;
        }

        public void construst(String nameSet, int hoursDurationSet, String teacherNameSet) {
                this.name = nameSet;
                this.hoursDuration = hoursDurationSet;
                this.teacherName = teacherNameSet;
        }
        //Setters

        public void setStartDate(Date startDate) {
                this.startDate = startDate;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setHoursDuration(int hoursDuration) {
                this.hoursDuration = hoursDuration;
        }

        public void setTeacherName(String teacherName) {
                this.teacherName = teacherName;
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

