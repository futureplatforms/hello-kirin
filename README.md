This is an example Kirin project demonstrating a round-trip method call from native to Kirin and back, on iOS and Android.

This project can be used as the basis for your own new project.

Import the root `build.gradle` into IntelliJ.  To build Android from the command-line, run `gradle assemble` from within the `android` folder.

Folder structure:

    android:  HelloKirin Android app
    core:  Core Kirin code goes in here.  All Java code
           must be GWT-compatible
    gwt:  The GWT module.  Mostly this will consume
          only the core library, however it may also
          provide GWT code for your project.
    gwt/src/resources:  GWT modules for Safari (iOS)
                        and ie6 (Windows Phone native)
    gwt/src/webapp:  The Kirin.html file which iOS
                     loads into its hidden UIWebView
    ios:  HelloKirin iOS app