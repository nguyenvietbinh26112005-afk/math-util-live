/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author VIETBINH
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("5! = 120; actual: " + result);
        // ki thuat kiem thu phan mem: uoc luong xem gia tri tra ve cua ham la gi
        //expected value: 5! = 120
        //may/ham ai do viet khi chay thuc te la may - actual, gai su 120
        //if excepted == actual, ham ngon trong tinh huong nay
        //MathUtil.getFactorial(-5);
        
        //THÊM CODE SAU LAN DAU TIEN LAM CHUYEN AY -  CODE LEN SERVER  24/11/2025 7:44pm
        System.out.println("1! = 1; actual: " + MathUtil.getFactorial(1));
        System.out.println("3! = 6; actual: " + MathUtil.getFactorial(6));
        
        System.out.println("6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("0! = 1; actual: " + MathUtil.getFactorial(1 ));
        
    }
    
}
