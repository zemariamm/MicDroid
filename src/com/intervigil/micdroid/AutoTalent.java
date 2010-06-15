package com.intervigil.micdroid;

public class AutoTalent {
	private static final String AUTOTALENT_LIB = "autotalent";
	
	static {
		System.loadLibrary(AUTOTALENT_LIB);
	}
	
	public static native void instantiateAutoTalent(int sampleRate);
	
	public static native void initializeAutoTalent(float concertA, char key, 
			float fixedPitch, float fixedPull, 
			float correctStrength, float correctSmooth, float pitchShift, int scaleRotate,
			float lfoDepth, float lfoRate, float lfoShape, float lfoSym, int lfoQuant, 
			int formCorr, float formWarp, float mix);
	
	public static native void processSamples(short[] samples, int sampleSize);
	
	public static native void destroyAutoTalent();
}
