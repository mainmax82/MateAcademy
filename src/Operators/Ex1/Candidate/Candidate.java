package Operators.Ex1.Candidate;

public class Candidate {
    public static void main(String[] args) {
        boolean knowJava=true;
        int yearsOfExperienceInJava=2;
        boolean isGoodCandidate=knowJava&&yearsOfExperienceInJava>=2;
        System.out.println(isGoodCandidate);
    }
}
