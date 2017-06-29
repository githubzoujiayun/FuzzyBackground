# FuzzyBackground
一款实现高斯模糊的依赖库

原图和效果图:<br>
![alt text](https://github.com/javaexception/FuzzyBackground/blob/master/app/src/main/res/mipmap-xhdpi/ccc.jpg)
![alt text](https://github.com/javaexception/FuzzyBackground/blob/master/app/src/main/res/mipmap-xhdpi/bbb.jpg)<br>

**Gradle依赖**
-<br>
1. 最app外层的build.gradle 添加代码:<br>
```
allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' }   //添加
    }
}
```
2.在app 的build.gradle中添加：<br>

```
    dependencies {
  compile 'com.github.javaexception:FuzzyBackground:v1.0'
}
```

3.在app 的build.gradle添加：

```
    defaultConfig {
        applicationId "com.qzs.android.fuzzybackground"
        minSdkVersion 15
        targetSdkVersion 25
        versionCode 1
        versionName "1.0"

        renderscriptTargetApi 25    //添加
        renderscriptSupportModeEnabled true  //添加 

        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
    }
```
**使用方法**
-<br>

1. z主要是把imageview转换成bitmap对象（不一定要按我写的，主要是bitmap就可以）:<br>
  ```
  final Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.aaa);
  ```
  
  2.高斯模糊：<br>
  
    ```
    Bitmap finalBitmap = Fuzzy_Background.with(MainActivity.this)
                .bitmap(bitmap) //要模糊的图片
                .radius(20)//模糊半径
                .blur();
    ```
   <br> 
   3.设置bitmap：<br>
    ```
      imageView.setImageBitmap(finalBitmap);
    ```
    
**补充**
-<br>
1.模糊半径的范围：0<radius<25<br>

2.可以指定模糊前缩小的倍数<br>
 ```
Bitmap finalBitmap = Fuzzy_Background.with(MainActivity.this)
                        .bitmap(bitmap) //要模糊的图片
                        .radius(10)//模糊半径<br>
                        .scale(4)//指定模糊前缩小的倍数
                        .blur();
```

**[我的简书地址](http://www.jianshu.com/u/2a55d6e39135)**<br>

下面是我的公众号，我会努力完善的:<br>

![alt text](https://github.com/javaexception/FuzzyBackground/blob/master/app/src/main/res/mipmap-xhdpi/eee.jpg)<br>
