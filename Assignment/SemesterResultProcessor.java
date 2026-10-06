import java.util.Arrays;

public class SemesterResultProcessor {

    static void validate(int[][] marks) {

        if (marks == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }

        if (marks.length == 0) {
            return;
        }

        if (marks[0] == null) {
            throw new IllegalArgumentException("Invalid row");
        }

        int subjects = marks[0].length;

        for (int[] row : marks) {

            if (row == null || row.length != subjects) {
                throw new IllegalArgumentException(
                    "Matrix must be rectangular"
                );
            }

            for (int mark : row) {

                if (mark < 0 || mark > 100) {
                    throw new IllegalArgumentException(
                        "Marks must be between 0 and 100"
                    );
                }
            }
        }
    }

    static int[] totals(int[][] marks) {

        validate(marks);

        int[] result = new int[marks.length];

        for (int i = 0; i < marks.length; i++) {

            for (int mark : marks[i]) {
                result[i] += mark;
            }
        }

        return result;
    }

    static double[] subjectAverages(int[][] marks) {

        validate(marks);

        if (marks.length == 0) {
            return new double[0];
        }

        int subjects = marks[0].length;

        double[] averages = new double[subjects];

        if (subjects == 0) {
            return averages;
        }

        for (int j = 0; j < subjects; j++) {

            int sum = 0;

            for (int i = 0; i < marks.length; i++) {
                sum += marks[i][j];
            }

            averages[j] =
                Math.round((sum / (double) marks.length) * 100.0)
                / 100.0;
        }

        return averages;
    }

    static int topperIndex(int[][] marks) {

        int[] totals = totals(marks);

        if (totals.length == 0) {
            return -1;
        }

        int topper = 0;

        for (int i = 1; i < totals.length; i++) {

            if (totals[i] > totals[topper]) {
                topper = i;
            }
        }

        return topper;
    }

    static String[] resultCodes(int[][] marks) {

        validate(marks);

        String[] result = new String[marks.length];

        for (int i = 0; i < marks.length; i++) {

            int total = 0;
            boolean failed = false;

            for (int mark : marks[i]) {

                total += mark;

                if (mark < 40) {
                    failed = true;
                }
            }

            if (failed) {
                result[i] = "F";
            } else {

                double average =
                    total / (double) marks[i].length;

                if (average >= 75) {
                    result[i] = "D";
                } else if (average >= 60) {
                    result[i] = "M";
                } else {
                    result[i] = "P";
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] marks = {
            {80, 70, 90},
            {60, 55, 65},
            {90, 30, 95}
        };

        System.out.println(
            "totals=" + Arrays.toString(totals(marks))
        );

        System.out.println(
            "subjectAverages=" +
            Arrays.toString(subjectAverages(marks))
        );

        System.out.println(
            "topperIndex=" + topperIndex(marks)
        );

        System.out.println(
            "resultCodes=" +
            Arrays.toString(resultCodes(marks))
        );
    }
}