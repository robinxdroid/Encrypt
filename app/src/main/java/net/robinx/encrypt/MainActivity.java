package net.robinx.encrypt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.robinx.lib.encrypt.conceal.ConcealHelper;

import java.io.File;

import static net.robinx.lib.encrypt.conceal.ConcealHelper.encryptFile;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String json = "{\"message\":\"订单基础信息列表加载成功\",\"resultCode\":\"000\",\"totalPage\":1,\"orderList\":[{\"isKing\":false,\"orderStatusName\":\"被选择\",\"serviceTypeId\":3,\"orderStatus\":3,\"isOffer\":0,\"serviceTypeName\":\"汽车保养\",\"descp\":\"客户已向你付款 1次\",\"userPortraitUrl\":\"http://omg2.oomeng.cn/upload/userInfo/image/portrait/201608/b5280f3b-4bdd-413c-b9e6-4cd8e12fdbd8.png\",\"isImmediate\":1,\"address\":\"安徽省合肥市潜山路190号银泰城\",\"joinTime\":\"2016-11-07 18:00:06\",\"overdue\":\"2016-11-14 17:59\",\"serviceTime\":\"2016-11-07 17:59\",\"userId\":146673288912590055,\"userOrderStatus\":3,\"merchantId\":146665242493556038,\"userPhone\":\"15105609557\",\"orderId\":384022},{\"isKing\":false,\"orderStatusName\":\"被选择\",\"serviceTypeId\":3,\"orderStatus\":3,\"isOffer\":1,\"serviceTypeName\":\"汽车保养\",\"descp\":\"客户已选择你为TA服务\",\"userPortraitUrl\":null,\"isImmediate\":0,\"address\":\"安徽省合肥市蜀山区南二环和潜山路交叉口华邦世贸城\",\"joinTime\":\"2016-08-12 17:14:42\",\"overdue\":\"2016-08-12 20:00\",\"serviceTime\":\"2016-08-12 20:00\",\"userId\":146668054572087413,\"userOrderStatus\":3,\"merchantId\":146665242493556038,\"userPhone\":\"15000000007\",\"orderId\":381943}]}";
        CLog.i("json = %s",json);
        long startTime = System.currentTimeMillis();
        String encryptText = ConcealHelper.encryptString(json);
        long encryptEndTime = System.currentTimeMillis();
        CLog.i("EncryptText = %s",encryptText);
        CLog.i("Encrypt Duration = %s",encryptEndTime-startTime);
        String originalText = ConcealHelper.decryptString(encryptText);
        long decryptEndTime = System.currentTimeMillis();
        CLog.i("OriginalText = %s",originalText);
        CLog.i("Decrypt Duration = %s",decryptEndTime-encryptEndTime);


        File originalFile = new File("/sdcard/1.gif");
        File encryptFile = ConcealHelper.encryptFile(originalFile);

        File decryptFile = ConcealHelper.decryptFile(encryptFile);

    }
}
