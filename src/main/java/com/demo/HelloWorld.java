package com.demo;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.opencv_java;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class HelloWorld {

	public static void main(String[] args) {
		//System.loadLibrary("libopencv_java342");
		Loader.load(opencv_java.class);
        Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
        System.out.println("mat = " + mat.dump());
	}

}
