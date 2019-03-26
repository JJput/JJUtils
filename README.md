# JJUtils
![](https://img.shields.io/badge/%E4%BD%9C%E8%80%85-JJput-brightgreen.svg) ![](https://img.shields.io/badge/release-v1.1-green.svg)

常用公共工具类，结合个人使用以及复制部份[AnndroidUtilCode](https://github.com/Blankj/AndroidUtilCode)的工具类，感谢作者，写的非常好.

## 引用
在项目build.gradle下添加：

    allprojects {
    	repositories {
    		...
    		maven { url 'https://jitpack.io' }
    	}
    }
app -> build.gradle

    dependencies {
            implementation 'com.github.JJput:JJUtils:v1.1'
    }
    
    
| 类名 | 作用 |
| :-: | :-: |
| ShareUtils | SharedPreferences封装基本封装 |
| FileUtils | 文件操作 |
| ZipUtils | 解压/压缩 |
| XmlUtils | XML文件解析 |
| ToastUtils | 吐司工具 |
| LogUtils | 日志工具 |
| StringUtils | 字符串工具 |


