package com.nvxp.mathutil.test.core;

import com.nvxp.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)   //Câu lệnh này của JUnit báo hiệu rằng sẽ Loop qua tập data để lấy cặp
                                        //data input/expected nhồi vào hàm test
public class MathUtilDDTTest {
    
    //Hàm trả về mảng 2 chiều gồm nhiều cặp Expected-Input
    @Parameterized.Parameters     //JUnit vào hàm có parameters để loop
                                  //JUnit sẽ ngầm chạy qua từng dòng của mảng để lấy ra từng cặp data
                                  //Quan trọng là @, quy ước xem điều gì diễn ra.
    
    //Hàm satic là do cần lấy data ở chỗ tĩnh.
    public static Object[][] initData() {
        
        return new Integer[][] {
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
        };
    }
    
    //Giả sử đã loop qua từng dòng của mảng, ta vẫn cần gán từng value của cột vào biến tương ứng 
    //input / expected để sau đó feed cho hàm
    
    @Parameterized.Parameter(value = 0) //value = 0 là map với mảng data
    public int n; //biến map với value của cột 0 của mảng
    
    @Parameterized.Parameter(value = 1)
    public long expected; //kiểu long vì giá trị trả về của getF là long
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
         Assert.assertEquals(expected, MathUtil.getFactorial(n));
            
    }
}
