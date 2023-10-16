package com.nvxp.mathutil.test.core;

import com.nvxp.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;



public class MathUtilTest {
    //Đây là class sẽ sử dụng các hàm của thư viện JUnit để kiểm tra code chính - hàm tính giai thừa
    // bên core.Mathutil.
    
    //Viết code để test code chính
    
    //Có nhiều quy tắc đặt tên Hàm kiểm thử
    //Nhưng thường là nói lên mục đích của các case/tình huống kiểm thử, tình huống xài hàm
    //theo kiểu thành công và thất bại
    
    //Hàm này là tình huống test thành công, trả về ngon
    //ta sẽ xài hàm kiểu well - input 5, 6, không phải -5, -6
    
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    //Có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
         int n = 0; //test thử tình huống tử tế đầu vào, phải chạy đúng
         long expected = 1; 
         long actual = MathUtil.getFactorial(n); //Gọi hàm cần test bên core
         
         //So sánh dùng Framework
         Assert.assertEquals(expected, actual);
         //Đây là hàm giúp so sánh 2 giá trị nào đó có giống nhau không\
         //Nếu giống: ---> ra màu xanh, code ngon ít nhất cho case đang test
         //Nếu khác:  ---> Ra màu đỏ, hàm ý expected và actual không giống nhau
         
         
         //GỘP THÊM VÀI CASE THÀNH CÔNG/ĐẦU VÀO NGON
         Assert.assertEquals(1, MathUtil.getFactorial(1)); //Muốn 1 giai thừa = 1
         Assert.assertEquals(2, MathUtil.getFactorial(2)); 
         Assert.assertEquals(6, MathUtil.getFactorial(3)); 
         Assert.assertEquals(24, MathUtil.getFactorial(4)); 
         Assert.assertEquals(120, MathUtil.getFactorial(5)); 
         Assert.assertEquals(720, MathUtil.getFactorial(6)); 
            
    }
    
    //Ngoại lệ không phải value để so sánh nên không dùng AssertEquals
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
    }
    
    //Cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn _ Xài Lambda
    //Hàm sẽ ném về ngoại lệ nếu nhận vào 21
    //Cần thấy màu xanh khi chơi với 21!
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
//        Assert.assertThrows(Tham số 1: Loại ngoại lệ muốn so sánh,
//                            Tham số 2: Đoạn code văng ra ngoại lệ đó)

        Assert.assertThrows(IllegalArgumentException.class, 
                            () -> {
                                MathUtil.getFactorial(-5);
                            });
        
        //MathUtil.getFactorial(-5);
    }
    
    
    //Bắt ngoại lệ xem hàm có ném về ngoại lệ hay không
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        //Chủ động kiểm soát ngoại lệ
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            //Bắt try catch là JUnit sẽ ra màu xanh do đã chủ động kiểm soát ngoại lệ 
            //nhưng không chắc ngoại lệ mình cần có xuất hiện hay không
            //Cần đoạn code kiểm soát đúng ngoại lệ Illegal
            Assert.assertEquals("Invalid argument. N must be between 0 to 20", 
                                 e.getMessage());
        }
    }
    
}
