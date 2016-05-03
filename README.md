# Hello Kirin!

This is an example [Kirin](https://github.com/futureplatforms/Kirin) project demonstrating a round-trip method call from native to Kirin and back, on iOS and Android.

## How to use

Import the root `build.gradle` into IntelliJ, to edit the core project, and edit and run the Android project.  

To build Android from the command-line, run `../gradlew assemble` from within the `android` folder.  

To run the iOS project, open `ios/HelloKirin.xcodeproj`.

## Folder structure

    android:  HelloKirin Android app
    core:  Core Kirin code goes in here.  All Java code
           must be GWT-compatible
    core/src/main/resources:  GWT module file for the
                              core project
    gwt:  The GWT module.  Mostly this will consume
          only the core library, however it may also
          provide GWT code for your project.
    gwt/src/main/resources:  GWT modules for Safari
                            (iOS) and ie6 (Windows 
                            Phone native)
    gwt/src/main/webapp:  The Kirin.html file which iOS
                          loads into its hidden
                          UIWebView
    ios:  HelloKirin iOS app
    
## Use this as the basis for your own new project

This app is titled "org.hello.HelloKirin".

This name should be substituted with your app's name in the following (and filenames changed where appropriate):
    
    build.gradle
    gwt/build.gradle
    gwt/src/main/resources/hello/HelloKirin.gwt.xml
    gwt/src/main/resources/hello/HelloKirin_ie6_Debug.gwt.xml
    gwt/src/main/resources/hello/HelloKirin_ie6_Release.gwt.xml
    gwt/src/main/resources/hello/HelloKirin_safari_Debug.gwt.xml
    gwt/src/main/resources/hello/HelloKirin_safari_Release.gwt.xml