package TimBuchalka.section1_2_3;

public class LeapYearCalculator {


    public static void main(String[] args) {

        System.out.println(isLeapYear(1600));    }



        public static boolean isLeapYear(int year) {

            if(year < 1 || year > 9999 ) {
                return false;
            }else {

                if(year % 4 == 0){
                    if(year % 100 == 0){
                        if(year % 400 == 0){
                            return true;
                        }else {
                            return false;
                        }
                    }else{
                        return true;
                    }
                }else {
                    return false;
                }
            }

        }
    }

