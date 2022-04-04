import org.junit.Test;

import java.util.Random;

/**
 * @author : TangHao
 * @description :
 * @ClassName :DataBaseRandom
 * @createTime : 2022/3/18 15:27
 * @updateTime : 2022/3/18 15:27
 * @updateRemark : [说明本次修改内容]
 */
public class DataBaseRandom {

    @Test
    public void randomWorkers(){
        String[] firstName={"汤","赵","钱","孙","李","周","吴","郑","王","夏","刘","程","张","石"};
        String[] lastName={"昌茂","威","深思","磬音","昊磊","浩","婷","晨","盛","兰","顺","丽","朔","庭","福","智轩","文浩","鹏涛"," 林凯","京文","廷浩"};
        int[] id={1,2,3,4,5,6,7,8,9,10,11,12,13};
        int[] number2={0,1,2,3,4,5,6,7,8,9};
        Random random=new Random();
        String[] address={"南岸区","渝北区","江津区","大足县","垫江县","渝中区","沙坪坝区","北碚区","江北区","涪陵县","忠县","长寿区","万州区"};
        for (int i = 2; i < 41; i++) {
            int index=random.nextInt(firstName.length);
            int index2= random.nextInt(lastName.length);
            int index3=random.nextInt(id.length);
            int index4= random.nextInt(address.length);
            System.out.println(i+","+"'"+firstName[index]+lastName[index2]+"'"+",,30"+",'重庆市"+address[index4]+"'"+","+id[index3]);
        }
    }

    @Test
    public void randomCarNumber(){
        String[] str1={"A","B","C","F","G","H"};
        String[] str={"0","1","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        Random random=new Random();
        for (int i = 1; i < 21; i++) {
            System.out.println(i+","+"'渝"+str1[random.nextInt(str1.length)]+"·"+str[random.nextInt(str.length)]+str[random.nextInt(str.length)]+str[random.nextInt(str.length)]+str[random.nextInt(str.length)]+str[random.nextInt(str.length)]+"'"+","+i+","+ (random.nextInt(6)+1));
        }


    }
}
