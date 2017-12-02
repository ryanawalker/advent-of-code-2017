package santa.claus.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String fileName = ""; // enter filename/filepath here.

        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        int totalDiff = 0;
        int totalDivis = 0;

        String line;
        while((line = br.readLine()) != null){
            //process the line
            String[] lineStr = line.split("\t");
            int curMax = 0;
            int curMin = Integer.MAX_VALUE;
            int curIdx = 0;

            for (String numberStr : lineStr) {
                int number = Integer.parseInt(numberStr);
                if (number > curMax) {
                    curMax = number;
                }
                if (number < curMin) {
                    curMin = number;
                }

                for (int i = curIdx + 1; i < lineStr.length; i++) {
                    int number2 = Integer.parseInt(lineStr[i]);
                    if (number % number2 == 0) {
                        totalDivis += number / number2;
                    }
                    else if (number2 % number == 0) {
                        totalDivis += number2 / number;
                    }
                }

                curIdx += 1;

            }

            totalDiff += curMax - curMin;

        }
        br.close();
        System.out.println(totalDiff);
        System.out.println(totalDivis);
        }
}
