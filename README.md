## Introduction

This library make it possible to automatically report crahses in your Android app.
This library will eliminate worries of programmers who want to test their app in user's device.
Email will be sent automatically just after the crash happens in user's phone.

## Usage
To use the library is simple. You just need to add this line in your module's build.gradle file:

```
implementation 'com.dn.crashreporter:crashreporter:1.0'
```

Then add this line in your MainActivity class:

```
CrashReporter.init(context, email, password);
```

If you want to add custom handler to be triggered when the crash happens, you can use this code:

```
CrashReporter.init(context, email, password, OnErrorTriggeredListener);
```

If you want to set custom email subject and identify user when the crash happens, you can add custom Info into this library:

```
CrashReporter.init(context, email, password, new Info.Builder().setReportTitle("Email subject").setUserName("user name").build(), .OnErrorTriggeredListener);
```

## Contact Me

If you have a better idea or way on this project, please contact me at this [email](mailto:danaoscompany@gmail.com), thanks :)

### License

This library is licensed under General Public License (GPL) version 2.0
