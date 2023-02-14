//public class Armstrong {
//
///*    Check if the numbers from 0-999 are Armstrong number
//	An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
//	-- > ridicarea la cub se face cu clasa Math.pow()*/
//
//
////    public Armstrong(int armstrongNumber) {
////        this.armstrongNumber = 999 ;
////        armstrongNumber=999
//
////        this.armstrongNumber = armstrongNumber;
//
////    }
//
//        public void armstrong(int armstrongNumber){
//            int[] element = new int[4];
//            int temporar = armstrongNumber;
//            int rest = 0;
//            int sum = 0;
//
//            for (int i = 0; temporar > 0; i++) {
//                rest = temporar % 10;
//                element[i] = rest;
//                temporar = temporar / 10;
//            }
//
//
//            for (int i = 0; i < element.length; i++) {
//                sum = (int) (sum + Math.pow(element[i], 3));
//
//            }

//            if (armstrongNumber == sum) {
//                System.out.println("Este un numar Armstrong" + sum);
//            } else {
//                System.out.println("Nu este numar Armstrong");
//            }
//
//
//        }
//        public static void main (String []args){
//            Armstrong numbers = new Armstrong();
//            numbers.armstrongNumber(371);
//            for (long i=0; 1 <=100000; i++){
//
//            }
//        }
//
//    }
//    }
//
