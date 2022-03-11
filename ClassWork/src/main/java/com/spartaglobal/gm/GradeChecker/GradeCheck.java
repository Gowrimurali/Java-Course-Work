package com.spartaglobal.gm.GradeChecker;

public class GradeCheck {

    public static void gradeChecker(int mark) {
        if (mark <= 10) {
            System.out.println("Grade is C");
        } else if(mark > 10 && mark <= 50)
        {
            System.out.println("Grade is B");
        } else{
            System.out.println("Grade is A");
        }
    }
}
