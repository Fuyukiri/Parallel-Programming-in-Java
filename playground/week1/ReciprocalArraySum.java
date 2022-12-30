package week1;

public class ReciprocalArraySum {
    public static void main(String[] args) {
        int nCores = Runtime.getRuntime().availableProcessors();
        System.out.println(nCores);
        String ncoresStr = System.getenv("COURSERA_GRADER_NCORES");
        if (ncoresStr == null) {
            System.out.println(Runtime.getRuntime().availableProcessors()); ;
        } else {
            System.out.println(Integer.parseInt(ncoresStr));
        }
    }
}
