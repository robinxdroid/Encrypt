package net.robinx.lib.encrypt;

import android.content.Context;

public class SecretKeyHelper {
	static {
		System.loadLibrary("secretkey");
	}
	private static String sSecretKeyText;
	public static String getSecretKey(Context con){
		if (sSecretKeyText ==null) {
			sSecretKeyText =createSecretKey(con);
		}
		return sSecretKeyText;
	}
	
	private static native String createSecretKey(Context con);

}
