class Course {

    String courseName;
    int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void getCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration in months: " + duration);
    }

}

class OnlineCourse extends Course {

    boolean isRecorded;
    String platform;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.isRecorded = isRecorded;
        this.platform = platform;
    }

    void getCourseDetails() {
        super.getCourseDetails();
        System.out.println("Recorded: " + isRecorded);
        System.out.println("Platform: " + platform);
    }

}

class PaidOnlineCourse extends OnlineCourse {

    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration,platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void getCourseDetails() {
        super.getCourseDetails();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount);
    }

}

class Main3 {

    public static void main(String[] args) {

        OnlineCourse o = new OnlineCourse("Java", 6, "Youtube", true);
        o.getCourseDetails();
        PaidOnlineCourse d = new PaidOnlineCourse("Python", 12, "Unacademy", true, 1200, 200);
        d.getCourseDetails();
    }
}
