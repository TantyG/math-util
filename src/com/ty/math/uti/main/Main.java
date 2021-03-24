/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ty.math.uti.main;

import com.ty.mathutil.MathUtility;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // tui mun test 5! co dung 120 hem???
        int n = 5;          //n!
        long expected = 120; //hy vong 120 tra ve
        long actual = MathUtility.getFactorial(n);       // thuc te ham chay la may vay??
        //minh so sanh de biet dung sai???
        System.out.println("5! expected: " + expected + "; actual: " + actual);
        
        
        //tui mun test 0! co dung la 1 hem?
        n = 0;          //n!
        expected = 1; //hy vong 120 tra ve
        actual = MathUtility.getFactorial(n);       // thuc te ham chay la may vay??
        //minh so sanh de biet dung sai???
        System.out.println("5! expected: " + expected + "; actual: " + actual);
    }
    
}

//Viet code xong phai test code-nguyen tac phai theo
//TEST ngay tung ham, tung class truoc khi rap chung voi cac class khac
//Test ngay khi xong ham, xong class 
//duoc goi la test muc do, muc Unit Test (test muc don vi code)
//Lam sao de test. Co nhieu cach
//1.Cach 1: sout(goi ham) de in ra ket qua xu lo cua ham 
//2.Cach 2: JOptionPane de popup len ket qua xu li cua ham
//3.Cach 3: Ghi ra LOG file, ra 1 trang web (JW)
//3 cach nay dieu phai dung mat de xem ket qua, va tu ket luan dung sai
//dung: tuc la ham chay ra 1 gia tri - ACTUAL VALUE va ta thay ACTUAL VALUE khop, bang voi cai gia
//tri ma ta mong doi, ta tinh truoc = tay, goi la EXPECTED VALUE
//vi du 5! thi ta hy vong expected ham tra ve 120 nhung khon nan thay, ham tra ve dunng 120 - actual 
//ham chay dung cho 5!
//* sai: tui test 6!, expected = 720, khon nan thay, chay ra actual = 120 ham xu li sai
//CACH 4: may oi so sanh gium va ket luan gium t luon vi m co cac phep toan so sanh ma
//con nguoi k can nhin tung dong ket qua tra ve de luan dung sai may se lo cho
//neu tat ca tinh huong chay ham dung -> ham dung -> mau xanh
//hau het tinh huong chay ham dieu dung, co 1 cai sai -> ham sai -> mau do
//do: chi can 1 thang sai
//xanh: tat ca phai deu dung

//mun lam dc dieu nay ta can thu vien phu tro giup cho java xanh do 
//dieu nay cung co ben C# PHP, JS, RUBY....
//Java: JUnit,TestNG
//C#: NUnit, xUnit, MSTest
//PHP: PHPUnit
//....