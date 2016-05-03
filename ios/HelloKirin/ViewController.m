//
//  ViewController.m
//  HelloKirin
//
//  Created by Douglas Hoskins on 03/05/2016.
//  Copyright © 2016 Douglas Hoskins. All rights reserved.
//

#import "ViewController.h"
#import <KirinKit/NSObject+Kirin.h>
#import "fromNative/HelloModule.h"

@interface ViewController ()
@property (strong) id <HelloModule> kirinModule;

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    [self kirinStartModule:@"HelloModule" withProtocol:@protocol(HelloModule)];
    [self.kirinModule kirinMethod:@"Hi from iOS" :4567];
    // Do any additional setup after loading the view, typically from a nib.
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (void) nativeMethod: (NSString*) str {
    NSLog(@"nativeMethod: %@", str);
}

@end
