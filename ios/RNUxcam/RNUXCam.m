//
//  RNUXCam.m
//  RNUXCam
//
//  Created by Denis Stepanov on 23.08.16.
//  Copyright © 2016 Facebook. All rights reserved.
//

#import "RNUXCam.h"
#import <UXCam/UXCam.h> 

@implementation RNUXCam

// The React Native bridge needs to know our module
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(tagUsersName:(NSString*)userName:(RCTResponseSenderBlock)callback) {
  if (userName.length>0)
  {
    [UXCam tagUsersName:userName additionalData:nil];
    callback(@[[NSNumber numberWithBool:true]]);
  }
  else
  {
    callback(@[[NSNumber numberWithBool:false]]);
  }
}


RCT_EXPORT_METHOD(tagScreenName:(NSString*)screenName:(RCTResponseSenderBlock)callback) {

  if (screenName.length>0)
  {
    [UXCam tagScreenName:screenName];
    
    callback(@[[NSNumber numberWithBool:true]]);
  }
  else
  {
    callback(@[[NSNumber numberWithBool:false]]);
  }
}

RCT_EXPORT_METHOD(addTag:(NSString*)tag:(RCTResponseSenderBlock)callback) {

  if (tag.length>0)
  {
    [UXCam addTag:tag];
    callback(@[[NSNumber numberWithBool:true]]);
  }
  else
  {
    callback(@[[NSNumber numberWithBool:false]]);
  }
}

@end
