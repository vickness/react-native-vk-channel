
#import "RNChannel.h"

@implementation RNChannel

RCT_EXPORT_MODULE()

/** 异步获取渠道信息，使用Promises封装*/
RCT_EXPORT_METHOD(getChannelInfo:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {

    //开启异步操作
    dispatch_async(dispatch_get_global_queue(DISPATCH_QUEUE_PRIORITY_DEFAULT, 0), ^{

        NSError *error = nil;
        NSDictionary *infoDictionary = [[NSBundle mainBundle] infoDictionary];
        NSString *channelInfo = [infoDictionary objectForKey:@"channel"];

        //NSLog(@"当前渠道：%@",channelInfo);
        channelInfo ? resolve(channelInfo) : reject(@"0", @"Get Channel failed!", error);
    });
}

@end

