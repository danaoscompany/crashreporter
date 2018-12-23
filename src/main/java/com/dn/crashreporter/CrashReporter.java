package com.dn.crashreporter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

public class CrashReporter {
    private static Context context;

    public static void init(Context context0, final String email, final String password) {
        context = context0;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable paramThrowable) {
                try {
                    String message = "";
                    message += ("Manufacturer: " + Build.MANUFACTURER + "\n");
                    message += ("Device model: " + Build.MODEL + "\n");
                    message += ("OS: Android " + Build.VERSION.RELEASE + "\n");
                    message += ("API version: " + Build.VERSION.SDK_INT + "\n\n\n");
                    message += (paramThrowable.getCause().getClass().getName() + ": " + paramThrowable.getCause().getMessage() + "\n");
                    if (paramThrowable.getCause().getStackTrace() != null) {
                        for (StackTraceElement e : paramThrowable.getCause().getStackTrace()) {
                            if (e != null) {
                                message += ("at " + e.getClassName() + "." + e.getMethodName() + "(" + e.getFileName() + ":" + e.getLineNumber() + ")\n");
                            }
                        }
                    }
                    GMailSender sender = new GMailSender(email, password);
                    try {
                        sender.sendMail("Error report", message, email, email, new OnMailSentListener() {
                            @Override
                            public void onMailSent() {
                            }
                        });
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void init(Context context0, final String email, final String password, final OnErrorTriggeredListener errorTriggeredListener) {
        context = context0;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable paramThrowable) {
                try {
                    if (errorTriggeredListener != null) {
                        errorTriggeredListener.onErrorTriggered();
                    }
                    String message = "";
                    message += ("Manufacturer: " + Build.MANUFACTURER + "\n");
                    message += ("Device model: " + Build.MODEL + "\n");
                    message += ("OS: Android " + Build.VERSION.RELEASE + "\n");
                    message += ("API version: " + Build.VERSION.SDK_INT + "\n\n\n");
                    message += (paramThrowable.getCause().getClass().getName() + ": " + paramThrowable.getCause().getMessage() + "\n");
                    if (paramThrowable.getCause().getStackTrace() != null) {
                        for (StackTraceElement e : paramThrowable.getCause().getStackTrace()) {
                            if (e != null) {
                                message += ("at " + e.getClassName() + "." + e.getMethodName() + "(" + e.getFileName() + ":" + e.getLineNumber() + ")\n");
                            }
                        }
                    }
                    GMailSender sender = new GMailSender(email, password);
                    try {
                        sender.sendMail("Error report", message, email, email, new OnMailSentListener() {
                            @Override
                            public void onMailSent() {
                            }
                        });
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void init(Context context0, final String email, final String password, final Info info) {
        context = context0;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable paramThrowable) {
                try {
                    String message = "";
                    if (info != null) {
                        if (!info.getUserName().equals("")) {
                            message += ("Name: " + info.getUserName() + "\n");
                        }
                    }
                    message += ("Manufacturer: " + Build.MANUFACTURER + "\n");
                    message += ("Device model: " + Build.MODEL + "\n");
                    message += ("OS: Android " + Build.VERSION.RELEASE + "\n");
                    message += ("API version: " + Build.VERSION.SDK_INT + "\n\n\n");
                    message += (paramThrowable.getCause().getClass().getName() + ": " + paramThrowable.getCause().getMessage() + "\n");
                    if (paramThrowable.getCause().getStackTrace() != null) {
                        for (StackTraceElement e : paramThrowable.getCause().getStackTrace()) {
                            if (e != null) {
                                message += ("at " + e.getClassName() + "." + e.getMethodName() + "(" + e.getFileName() + ":" + e.getLineNumber() + ")\n");
                            }
                        }
                    }
                    GMailSender sender = new GMailSender(email, password);
                    String title = info.getTitle();
                    if (title.equals("")) {
                        title = "Error report";
                    }
                    try {
                        sender.sendMail(title, message, email, email, new OnMailSentListener() {
                            @Override
                            public void onMailSent() {
                            }
                        });
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void init(Context context0, final String email, final String password, final Info info, final OnErrorTriggeredListener errorTriggeredListener) {
        context = context0;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable paramThrowable) {
                try {
                    if (errorTriggeredListener != null) {
                        errorTriggeredListener.onErrorTriggered();
                    }
                    String message = "";
                    if (info != null) {
                        if (!info.getUserName().equals("")) {
                            message += ("Name: " + info.getUserName() + "\n");
                        }
                    }
                    message += ("Manufacturer: " + Build.MANUFACTURER + "\n");
                    message += ("Device model: " + Build.MODEL + "\n");
                    message += ("OS: Android " + Build.VERSION.RELEASE + "\n");
                    message += ("API version: " + Build.VERSION.SDK_INT + "\n\n\n");
                    message += (paramThrowable.getCause().getClass().getName() + ": " + paramThrowable.getCause().getMessage() + "\n");
                    if (paramThrowable.getCause().getStackTrace() != null) {
                        for (StackTraceElement e : paramThrowable.getCause().getStackTrace()) {
                            if (e != null) {
                                message += ("at " + e.getClassName() + "." + e.getMethodName() + "(" + e.getFileName() + ":" + e.getLineNumber() + ")\n");
                            }
                        }
                    }
                    GMailSender sender = new GMailSender(email, password);
                    String title = info.getTitle();
                    if (title.equals("")) {
                        title = "Error report";
                    }
                    try {
                        sender.sendMail(title, message, email, email, new OnMailSentListener() {
                            @Override
                            public void onMailSent() {
                            }
                        });
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
