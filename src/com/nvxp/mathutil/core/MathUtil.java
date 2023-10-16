package com.nvxp.mathutil.core;
//Package core chứa code chính

public class MathUtil {
    //Trong class này cung cấp nhiều hàm xử lý toán học
    //Clone class Math của JDK
    //Hàm thư viện xài chung, không cần lưu lại trạng thái, giá trị -> chọn thiết kế là static

    //Hàm tính giai thừa!!!
    //n! = 1.2.3...n
    //Không có giai thừa cho số âm
    //0! = 1! = 1
    //Hàm giai thừa dốc đứng, tăng nhanh về giá trị
    //20! gồm 18 con số 0, vừa kịp đủ cho kiểu long của Java
    //Bài này quy ước tính n! từ 0 đến 20
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid argument. N must be between 0 to 20");
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//
//        long product = 1; // tích nhân dồn
//        for (int i = 1; i <= n; i++) {
//            product *= i;
//        }
//
//        return product;
//    }
    
    //Đệ quy - Recursion
    //Hiện tượng gọi lại chính mình với 1 quy mô khác
    //Tính 6!
    //6! = 6 x 5!
    //5! = 5 x 4!
    //4! = 4 x 3!
    //3! = 3 x 2!
    //2! = 2 x 1! Điểm dừng
    //1! = 1 rồi hồi ngược lại
    
    // Quy ước 1! = 0! = 1
    
    //Chốt: n! = n * (n - 1)!
    
    public static long getFactorial(int n) {
        
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. N must be between 0 to 20");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * getFactorial(n - 1);
    }
}
