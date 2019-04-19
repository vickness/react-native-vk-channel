
import { NativeModules } from 'react-native';

const { RNChannel } = NativeModules;

export default class Channel {

    /**
     * 获取渠道信息
     * */
    static getChannelInfo() {
        return RNChannel.getChannelInfo();
    }
}
