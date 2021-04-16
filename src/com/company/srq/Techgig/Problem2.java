package com.company.srq.Techgig;

import java.util.Scanner;

public class Problem2 {
    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        while (N-- > 0) {
            String[] str = scan.nextLine().split(" ");
            int L = Integer.parseInt(str[0]);
            int R = Integer.parseInt(str[1]);
            System.out.println(result(L, R));
        }

    }

    static int result(int L, int R) {
        int primeL = Integer.MAX_VALUE;
        int primeR = Integer.MIN_VALUE;

        if (L <= 2) {
            primeL = 2;
        } else {
            for (int i = L; i <= R; i++) {
                boolean bool = true;
                for (int j = 2; j <= (i / 2); j++) {
                    if (i % j == 0) {
                        bool = false;
                        break;
                    }
                }
                if (bool) {
                    primeL = i;
                    break;
                }
            }
        }
        for (int i = R; i >= 2; i--) {
            boolean bool = true;
            for (int j = 2; j <= (i / 2); j++) {
                if (i % j == 0) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                primeR = i;
                break;
            }
        }
        if (primeL <= primeR) {
            if (primeL == primeR) {
                return 0;
            }
            return primeR - primeL;
        }
        return -1;
    }
}
