// enum Info {
//     NAME, CLASS, SCORE, SUBJECT
// }

// Info myClass = Info.CLASS;

// public class EnumClass {
//     enum Info {
//         JOSHUA, SS1, SCORE100, JAVA
//     }

//     public static void main(String[] args) {
//         Info myName = Info.SS1;

//         System.out.println(myName);
// }
// }

// import java.time.Period;

enum Period {
    MORNING, AFTERNOON, EVENING, NIGHT, MIDNIGHT
};

public class EnumClass {

    public static void main(String[] args) {
        // Period per = Period.MORNING;
        // switch (per) {
        // case MORNING:
        // System.out.println("Wake Up and prepare for Work.");
        // break;
        // case AFTERNOON:
        // System.out.println("Take you launch at the restaurant.");
        // break;
        // case EVENING:
        // System.out.println("Return home before it's dark.");
        // default:
        // break;

        // }
        // System.out.println(per);
        // }

        for (Period per : Period.values()) {
            System.out.println(per);
            // THIS WILL LOOP THROUGH ALL THE PERIOD AND DISPLAY THE PERIOD.
        }
    }
}

// enum Period {
// MORNING, AFTERNOON, EVENING, NIGHT, MIDNIGHT};

// for( Period per: Period.values() ){
// System.out.println(per)
// }