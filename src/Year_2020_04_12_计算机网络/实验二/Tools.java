package Year_2020_04_12_计算机网络.实验二;

public class Tools {

    /**
     * CRC和计算校验码
     * @param data                 数据
     * @param generatorPolynomial  生成多项式
     * @param checkCode            校验码
     * @return                     当校验码为空时，用生成多项式计算校验码，当校验码不为空时，返回余数。
     */
    public static String isRightData(String data,String generatorPolynomial,String checkCode){

        //给data加上4（生成多项式长度减一）个零         11010110110000
        if(checkCode==null){
            for(int i=0;i<generatorPolynomial.length()-1;i++){
                data+="0";
            }
        }else {//校验码不为空，给数据加上校验码，
            data+=checkCode;
        }
        System.out.println("data:"+data);
        String res=data.substring(0,generatorPolynomial.length());//11010
        System.out.println("data的前五位"+res);
        data=data.substring(generatorPolynomial.length());//data去掉前五位数 :110110000

        //当data的长度为0时结束
        while(data.length()!=0){
            //按位异或
            res=getRes(res,generatorPolynomial);
            System.out.println("异或的结果为："+res);

            //让res的长度与 生成多项式的长度相同
            while (res.length()<generatorPolynomial.length()){
                if(data.length()!=0){
                    //当res的长度为0时，0不往res上加 ，让res的第一为始终为1
                    if(data.charAt(0)=='0'&&res.length()==0){
                        data=data.substring(1);
                        continue;
                    }
                    res+=data.charAt(0);
                    data=data.substring(1);
                }else {
                    break;
                }
            }
            System.out.println("新的res为："+res);
        }

        //当data没有时（长度减到0了），如果res的长度 等于 生成多项式的长度，还应该进行一次按位异或，否则直接输出结果
        if(res.length()==generatorPolynomial.length()){
            //按位异或
            res=getRes(res,generatorPolynomial);
            //校验码的长度不够时前面 + 0 补全
            while(res.length()<generatorPolynomial.length()-1){
                res="0"+res;
            }
        }

        return res;
    }

    //按位异或的结果
    public static String getRes(String str,String generatorPolynomial){
        String res="";
        //这两个字符串按位异或
        for(int i=0;i<str.length();i++){
            res+=String.valueOf(Integer.valueOf(str.charAt(i))^Integer.valueOf(generatorPolynomial.charAt(i)));
        }
        //System.out.println("res=="+res.charAt(0));
        //去掉res开头的0      01111->1111
        res=String.valueOf(Integer.valueOf(res));
        //如果res就是0，返回一个空字符串
        if("0".equals(res)){
            res="";
        }
        return res;
    }
}
