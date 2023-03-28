package Exe14Mar.CNP;

import Utils.Utils;

public class CNPRunner {
    public static void main(String[] args) {
        System.out.println("Introduceti un CNP:");
        String number = Utils.scanner().nextLine();

        CNP obj = new CNP();
        obj.verificarecnp(number);
    }
}
