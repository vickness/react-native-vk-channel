
# react-native-vk-channel

## Getting started

`$ npm install react-native-vk-channel --save`

### Mostly automatic installation

`$ react-native link react-native-vk-channel`

### Manual installation


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
      compile project(':react-native-vk-channel')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNChannel.sln` in `node_modules/react-native-vk-channel/windows/RNChannel.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Channel.RNChannel;` to the usings at the top of the file
  - Add `new RNChannelPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNChannel from 'react-native-vk-channel';

// TODO: What to do with the module?
RNChannel;
```
