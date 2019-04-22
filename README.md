
# react-native-vk-channel

ReactNative多渠道打包工具，Android采用美团打包神器walle实现，iOS采用isign实现，可以配置在服务器自动化打包
- iOS打包工具：[isign](https://github.com/saucelabs/isign)
- Android打包工具：[walle](https://github.com/Meituan-Dianping/walle)

## 安装

`$ npm install react-native-vk-channel --save`

`$ yarn add react-native-vk-channel`

### 自动配置

`$ react-native link react-native-vk-channel`

### 手动配置


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-vk-channel` and add `RNChannel.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNChannel.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNChannelPackage;` to the imports at the top of the file
  - Add `new RNChannelPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-vk-channel'
  	project(':react-native-vk-channel').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-vk-channel/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      implementation project(':react-native-vk-channel')
  	```

## 使用
```javascript
import Channel from 'react-native-vk-channel';

//获取渠道信息
Channel.getChannelInfo()
       .then(res => {
          console.log('当前渠道信息：',res);
       }).catch(error => {
          console.log('获取渠道信息失败');
       });
```

## Android 打包工具安装
需要安装JAVA环境，下载命令行工具[walle-cli](https://github.com/Meituan-Dianping/walle/blob/master/walle-cli/README.md)，放在系统根目录，具体使用查看说明文档

## iOS 打包工具安装
1. 安装工具，仅支持 Linux 和 Mac OS X 系统
```
$ git clone https://github.com/saucelabs/isign.git
$ cd isign
$ sudo ./INSTALL.sh
```

2. 制作签名证书，导出.p12文件，使用shell脚本生成.pem文件，文件默认在 ~/.isign 目录下
```
$ isign_export_creds.sh ~/Certificates.p12
```

3. 将配置文件 .mobileprovision，改名 isign.mobileprovision ，移到 ~/.isign/ 目录下
```
~/.isign/ 目录下最终文件：

certificate.pem
isign.mobileprovision
key.pem
```

4. 签名打包
```
$ isign -o resigned.ipa my.ipa
```

## License

[MIT](https://opensource.org/licenses/MIT)


