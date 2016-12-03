#Encrypt
Android平台加解密

#Usage
[看这里](http://robinx.net/2016/11/30/%E5%8A%A0%E5%AF%86%E4%BD%A0%E7%9A%84App/)

#### 在项目的Application的onCreate()函数中初始化

```java
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ConcealHelper.init(this);
    }
}
```

#### 加密字符串

```java
 String encryptText = ConcealHelper.encryptString(jsonStr);

```

#### 解密字符串

```java
String originalText = ConcealHelper.decryptString(encryptText);

```

中间我们还加了一层Base64编码，因为Conceal的加解密都是针对byte[],使用Base64对其编码，转换为字符串

测试发现很长的一串Json，每次加密时间基本在10 ms以内，解密时间与加密差不多，可以说是飞快了。

#### 加密文件

```java
File originalFile = new File("/sdcard/1.gif");
File encryptFile = ConcealHelper.encryptFile(originalFile);
```

#### 解密文件

```java
File decryptFile = ConcealHelper.decryptFile(encryptFile);
```

#Thanks
[conceal](https://github.com/facebook/conceal)<br>
#About me
Email:735506404@robinx.net<br>
Blog:[www.robinx.net](http://www.robinx.net)
