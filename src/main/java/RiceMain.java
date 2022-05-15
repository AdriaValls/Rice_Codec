import Codec.RiceDecoder;
import Codec.RiceEncoder;

import java.util.ArrayList;

public class RiceMain {

    public static void main(String[] args) {
        System.out.println("Rice Codec");
        StringBuffer bitString = new StringBuffer("");
        RiceEncoder encoder = new RiceEncoder();
        RiceDecoder decoder = new RiceDecoder();
        ArrayList<Integer> numList = new ArrayList<>();
        int M = 256;
        int num = 578;
        bitString = encoder.encodeNumber(num, M);
        System.out.println("Number: " + num + "\n");
        System.out.println("Encoded Number: " + bitString + "\n");

        System.out.println("Decoded Number: " + decoder.decodeNumber(bitString,M) + "\n");



    }


}
