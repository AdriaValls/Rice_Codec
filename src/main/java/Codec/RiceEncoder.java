package Codec;

import java.lang.Math;
import java.util.ArrayList;

public class RiceEncoder {

    public StringBuffer encodeSequence(ArrayList<Integer> numList, int M){

        StringBuffer bitSequence = new StringBuffer("");

        for(int i=0; i<numList.size(); i++){
            bitSequence.append(encodeNumber(numList.get(i),M));
        }
        return bitSequence;
    }

    public StringBuffer encodeNumber(int number, int M){

        StringBuffer bitCode = new StringBuffer("");

        int Q = Math.abs(number/M);
        int R = Math.abs(number % M);


        if(number<0){
            bitCode.append(0);
        }else{
            bitCode.append(1);
        }

        for(int i=0; i<Q; i++){
            bitCode.append(1);
        }
        bitCode.append(0);

        bitCode.append(numberToBinary(Q, R, M));

        return bitCode;
    }

    public StringBuffer numberToBinary(int number, int R,int M){

        StringBuffer bitString = new StringBuffer("");
        StringBuffer numStr = new StringBuffer("");

        int numBits = (int)Math.ceil(Math.log(M) / Math.log(2));
        numStr.append(Integer.toBinaryString(R)) ;

        for(int i=0; i<(numBits-numStr.length()); i++){
            bitString.append(0);
        }

        bitString.append(numStr);

        return bitString;
    }
    
}
