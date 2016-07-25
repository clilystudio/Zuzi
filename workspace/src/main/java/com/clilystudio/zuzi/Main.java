package com.clilystudio.zuzi;

import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Main {

	public static void main(String[] args) {
		String apkFile = "E:/zssq-Official.apk";
		try {
			ZipFile zipFile = new ZipFile(apkFile);
			Enumeration<? extends ZipEntry> entries = zipFile.entries();
			while (entries.hasMoreElements()) {
				ZipEntry element = entries.nextElement();
				System.out.println("element:" + element.getName());
			}
			zipFile.close();
		} catch (IOException e) {
	        System.err.println("Can't open file:" + apkFile);
			e.printStackTrace();
		}
        System.out.println("Zuzi.");
	}

}
