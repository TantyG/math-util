/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ty.mathutil.test;

import static com.ty.mathutil.MathUtility.*; //t mun cac ham, bien trong class go truc tiep luon
                                    //go truc tiep ko can class cham chi static moi co dieu nay
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
import java.sql.SQLException;
public class MathUtilityTest {
   
    @Test
    public void testFactorialGivenRightArgumentReturnsGoodResult(){
       int n = 5;       //tui mun test 5! co dung la 120 k
       long expected = 120; //120 hay ko
       long actual = getFactorial(n);
       assertEquals(expected, actual);
       
       //minh test tiep cac truong hop khac dung dau vao, dung dau ra
       //khoi can bien trung gian, choi luon trong lenh
       
       
       assertEquals(720, getFactorial(6));
       assertEquals(24, getFactorial(4));
       assertEquals(6, getFactorial(3));
       assertEquals(1, getFactorial(1));
       assertEquals(1, getFactorial(0));
   }
    
    //dieu gi xay ra neu ta dua tham so ca chon, am , hoac > 20
    //theo thiet ke cua ham, dua vao ca chon se nem ra ngoai le
    //va ta can TEST XEM, NGOAI LE co duoc nem ra k neu ta ca chon 
    //tuc la thay xuat hien ngoai le neu co ca chon dua vao -> ham dung
    //thay ngoai le khi co ca chon minh lai mung vi ham da chay dung
    @Test(expected = IllegalArgumentException.class)
    //co dung khi chay ham nay thi nem ra ngoai le ten la IllegalArgu......
    //neu dung no nem ra ngoai le cung ten, code dung roi, XANH THOY
    public void testFactorialWrongArgumentThrowsException(){
        //minh test tinh huong ham phai nem ra ngoai le neu tham so ca chon
        //ngoai le ko phai la value de so sanh, ko dung assertEquals()
        //ta phai dung chieu khac. JUNIT4 khac JUNIT5 o cho bat ngoai le
        //DI(Dependency Injection) / SOLID, lambda Expression lien quan den JUnit 5
        getFactorial(-5);
        getFactorial(21);
        getFactorial(40);
        
    }
    
}
