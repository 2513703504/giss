import org.junit.Test;

/**
 * @author : TangHao
 * @description :
 * @ClassName :DataTest
 * @createTime : 2022/4/14 8:13
 * @updateTime : 2022/4/14 8:13
 * @updateRemark : [说明本次修改内容]
 */
public class DataTest {

    @Test
    public void test1(){
        int[] year={200,225,224,256,281,335,349,399,410,438,466,494};
        int[] number={2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018};

        double m=0;
        double n=0;
        double x=0;
        double y=0;

        for (int i = 0; i < number.length; i++) {
            m += number[i]*year[i];
            x += number[i];
            y += year[i];
            n += number[i]*number[i];
        }

        System.out.println(m);
        System.out.println(x);
        System.out.println(y);
        System.out.println(n);


        double b=(12*m-(x*y))/((12*n)-x*x);
        double a=(y-b*x)/12;

        System.out.println(a);
        System.out.println(b);

        double next=a+b*2019;
        System.out.println(next);
    }
}
