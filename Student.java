public class Student {
    private String name;
    private double score;
    private boolean passed;

    public Student (String name, double score) {
        this.name = name;
        this.score = score;
    }

    public void checkPassed() {
        if(score >= 70) {
            passed = true;
        } else {
            passed = false;
        }
    }
    

}
