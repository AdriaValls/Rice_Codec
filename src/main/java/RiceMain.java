import Codec.RiceEncoder;

import java.util.ArrayList;

public class RiceMain {

    public static void main(String[] args) {
        System.out.println("Rice Codec");
        StringBuffer bitString = new StringBuffer("");
        RiceEncoder encoder = new RiceEncoder();
        ArrayList<Integer> numList = new ArrayList<>();
        int M = 256;
        numList.add(578);
        numList.add(-135);
        numList.add(1089);
        bitString.append(encoder.encodeSequence(numList, M));

        System.out.println(bitString);

    }


}
