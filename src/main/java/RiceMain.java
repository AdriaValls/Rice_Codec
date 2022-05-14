import Codec.RiceEncoder;

public class RiceMain {

    public static void main(String[] args) {
        System.out.println("Rice Codec");
        StringBuffer bitString = new StringBuffer("");
        RiceEncoder encoder = new RiceEncoder();

        bitString.append("");

        System.out.println(encoder.encodeNumber(1089, 256));

    }


}
