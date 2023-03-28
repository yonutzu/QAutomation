package Exe14Mar.CNP;

public class CNP {
    final int[] constanta = {2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9};

    public void verificarecnp(String cnp) {
        if (cnp.length() != 13) {
            System.out.println("CNP-ul este invalid");
        }
        int sum = 0;

        for (int i = 0; i < 12; i++) {
            sum = sum +Integer.parseInt (String.valueOf(cnp.charAt(i) * constanta[i]));
        }
        int cifraControl = 0;
        if (sum % 11 == 10) {
            cifraControl = 1;
        } else if (sum % 11 < 10) {
            cifraControl = sum % 11;
        }
        if(cifraControl!=Integer.parseInt(String.valueOf(cnp.charAt(12)))){
            System.out.println("CNP este invalid");
        }else{
            System.out.println("CNP este valid");
        }
    }
}
