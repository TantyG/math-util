/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ty.mathutil;

/**
 *
 * @author DELL
 */
public class MathUtility {

    //class nay chua 1 nhom hang toan hoc, fake tu class chuan
    //java.until.Math cuar JDK
    //vi la do xai chung cho nen se l aSTATIC
    public static final double PI = 3.1415;

    //ham tinh n!
    //vi giai thua tang rat nhanh, 21! tran kieu long
    //kieu long chiu dc 10^18 18con so. lon hon nua la thua
    //am giai thua ko tinh dc
    //ham chi chap nhan tu 0..20! -> long
    //0! = 1! = 1
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invaild argument. n must be betewen 0..20");

        if (n == 0 || n == 1)
            return 1;

        //song sot den doan nay, sure n = 0..20
        long result = 0; //co tinh de value nay
        for (int i = 2; i <= n; i++) 
            result *= i;
        //n! = 1.2.3.4.5....n
        return result;

    }
}
