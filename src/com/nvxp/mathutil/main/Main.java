/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nvxp.mathutil.main;

import com.nvxp.mathutil.core.MathUtil;

/**
 *
 * @author Hust-P
 */
public class Main {
    public static void main(String[] args) {
        //Thử nghiệm hàm có chạy đúng theo thiết kế không
        // ta phải đưa các tình huống sử dụng hàm trong thực tế.
        // đưa vào -5 | 0 | 20 | 21
        
        //TEST CASE: Một tình huống hàm/app/màn hình/tính năng được đưa vào sử dụng giả lập hành vi xài của ai đó.
        //TEST CASE LÀ MỘT TÌNH HUỐNG SỬ DỤNG APP (HÀM) MÀ NÓ BAO GỒM:
        // - INPUT: DATA ĐẦU VÀO
        // - OUTPUT: ĐẦU RA ỨNG VỚI XỬ LÍ CỦA HÀM/CHÚC NĂNG CỦA APP, DÙNG ĐẦU VÀO ĐỂ XỬ LÝ
        // - KÌ VỌNG (EXPECTED): MONG HÀM TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPUT Ở TRÊN
        // - SO SÁNH ĐỂ XEM KẾT QUẢ CÓ NHƯ KÌ VỌNG HAY KHÔNG
        
        long expected = 120; //kì vọng 120 khi tính 5!
        int n = 5;
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " (expected)");
        System.out.println("5! = " + actual + " (actual)");
    }
}
