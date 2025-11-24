/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author VIETBINH
 */
//TA VIET CAI CLASS DE CUNG CAP TIEN ICH CHO NOI KHAC XAI
// KHI TA CUNG CAP TIEN ICH CHO NOI KHAC XAI, DO LA LUC TA KO CAN NHO CAI GI
// CHO RIENG TA, HAM STATIC GIUP LAM DIEU NAY
public class MathUtil {
    
    //n! = 1.2.3.4.5.6....n
    //0! = 1! = 1
    //ko tinh giai thua cho so am
    //20! la vua khop kieu long, kieu long toi da 18 con so 0
    // 21! lo kieu long
    // neu dua vao am, 21 giai thua, ta eo tinh, ta dap vao mat ai xai ham
    // mot cai ngoai le, chui eo tinh dc
    
    public static long getFactorial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument, n must be between 0 and 20");
        // ham dung lien eo can return
        if( n ==0 || n == 1)
            return 1;   //dung ngay khi n dac biet
        // n = 2...20
        //choi for hoac de quy - recursion
        //ki thuat nhoi con heo dat, oc bu don thit
        //i = 2, i = 3, i = 4..... i = n nhoi lien tuc i vao tich
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product = product*i;
            // nhan tu 2 den n             
        }
        return product;
    }
}
