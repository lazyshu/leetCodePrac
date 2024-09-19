package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SlidingWIndow {
    static int[] iHaveNum;
    static int[] mustHaveNum;
    static int checksecret;
    public static void main(String[] args) throws IOException {
        //9 8
        //CCTGGATTG
        // 2 0 1 1 - A,C,G,T
        //return countResult

        // 첫번째 줄 numOfLetters, limitedNumberOfLetters 에 두기
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int numOfLetters = Integer.parseInt(st.nextToken());
        int limitedNumberOfLetters = Integer.parseInt(st.nextToken());

        //2번째 줄 받기- char array에 담아두기 CCTGGATTG
        st = new StringTokenizer(bf.readLine());
        char[] letters = new char[numOfLetters];
        letters = st.nextToken().toCharArray();
        iHaveNum = new int[4]; //input mustHaveNum(2 0 1 1) 이거랑 비교해서 내가 가지고 있는 갯수
        mustHaveNum = new int[4];

        //3번째 줄  // 2 0 1 1 - A,C,G,T
        st = new StringTokenizer(bf.readLine());
        checksecret=0;
        for (int i = 0; i < mustHaveNum.length; i++) {
            mustHaveNum[i] = Integer.parseInt(st.nextToken());
            if (mustHaveNum[i] == 0) {
                checksecret++;
                //다른거 A-2개 B-2개 이렇게 필요한건데 A-3개 B-1개 이래도 4개잖아 이게 모꼬 :(
            }
        }

        //포인터 만들자 :(
        int result=0;

        //포인터 끝이 8까지 갈때까지- 부분문자열 처음 받을떄 세팅
        for (int i = 0; i < limitedNumberOfLetters; i++) {
            add_count(letters[i]);
        }
        if (checksecret == 4) {
            result++;
        }

        //슬라이딩 윈도우 i=8, i<9
        for (int i = limitedNumberOfLetters; i < numOfLetters; i++) {
            int j = i - limitedNumberOfLetters;
            add_count(letters[i]);
            remove_count(letters[j]);
            if (checksecret == 4) {
                result++;
                break;
            }
        }
        System.out.println("result = " + result);


    }

    private static void add_count(char letter) {
        switch (letter) {
            case 'A':
                iHaveNum[0]++;
                if (iHaveNum[0] == mustHaveNum[0]) {
                    checksecret++;

                }break;
            case 'C':
                iHaveNum[1]++;
                if (iHaveNum[1] == mustHaveNum[1]) {
                    checksecret++;
                }break;
            case 'G':
                iHaveNum[2]++;
                if (iHaveNum[2] == mustHaveNum[2]) {
                    checksecret++;
                }break;
            case 'T':
                iHaveNum[3]++;
                if (iHaveNum[3] == mustHaveNum[3]) {
                    checksecret++;
                }break;
    }
    }

    private static void remove_count(char letter) {
        switch (letter) {
            case 'A':
                iHaveNum[0]--;
                if (iHaveNum[0] == mustHaveNum[0]-1) {
                    checksecret--;
                }
            case 'C':
                iHaveNum[1]--;
                if (iHaveNum[1] == mustHaveNum[1]-1) {
                    checksecret--;
                }
                break;
            case 'G':
                iHaveNum[2]--;
                if (iHaveNum[2] ==1-mustHaveNum[2]) {
                    checksecret--;
                } break;
            case 'T':
                iHaveNum[3]--;
                if (iHaveNum[3] ==1- mustHaveNum[3]) {
                    checksecret--;
                }
                break;
    }
    }
}
