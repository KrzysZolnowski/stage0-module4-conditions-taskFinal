package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year > 0) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31");
                    break;
                case 2:
                    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                        System.out.println("29");
                    } else {
                        System.out.println("28");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30");
                    break;
            }
        } else {
            System.out.println("invalid date");
        }
    }
}
// ((rok % 4 == 0) && (rok % 100 != 0)) || (rok % 400 == 0);

//Styczeń - 31
//        Luty - 28 albo 29
//        Marzec-31
//        Kwiecień-30
//        Maj-31
//        Czerwiec-30
//        Lipiec-31
//        Sierpień-31
//        Wrzesień-30
//        Październik-31
//        Listopad-30
//        Grudzień-31