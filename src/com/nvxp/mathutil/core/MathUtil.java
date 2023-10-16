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
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. N must be between 0 to 20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        long product = 1; // tích nhân dồn
        for (int i = 1; i <= n; i++) {
            product *= i;
        }

        return product;
    }
}
