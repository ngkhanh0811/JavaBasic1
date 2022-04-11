package ss6;/*Welcome to my show !

@author: NgKhanh
Date: 4/10/2022
Time: 7:15 PM

ProjectName: JavaBasic1*/

public class NativeModifier {
    native void nativeMethod();
    static {
        System.loadLibrary("NativeMethodDefinition");
    }

    public static void main(String[] args) {
        NativeModifier objNative = new NativeModifier();
        objNative.nativeMethod();
    }
}
