package Codec;

public class RiceDecoder {
    public RiceDecoder(){

    }

    public int decodeNumber(StringBuffer bitCode, int M){
        int decodedNumber;
        int Q = 0;
        String numBits;

        char sign = bitCode.charAt(0);

        int qPosition = 1;
        char nextQBit = bitCode.charAt(qPosition);

        if(nextQBit != '0'){
            Q += 1;
            while(nextQBit != '0'){
                qPosition = qPosition + 1;
                nextQBit = bitCode.charAt(qPosition);
                if(nextQBit == '1'){
                    Q += 1;
                }
            }
        }else {
            qPosition = qPosition + 1;
        }

        numBits = bitCode.substring(qPosition);

        decodedNumber = Integer.parseInt(numBits,2)+(Q*M);

        if (sign == '0'){
            decodedNumber *= -1;
        }

        return decodedNumber;
    }

}
