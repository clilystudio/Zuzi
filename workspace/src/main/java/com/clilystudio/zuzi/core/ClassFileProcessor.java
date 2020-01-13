package com.clilystudio.zuzi.core;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.clilystudio.zuzi.exception.ClassException;
import com.clilystudio.zuzi.info.ClassInfo;

public class ClassFileProcessor {
	
	public ClassInfo getClassInfo(DataInputStream dis) throws ClassException {
		ClassInfo clsInfo = new ClassInfo();
		
		try {
			int magic = dis.readInt();
			if (magic != 0xCAFEBABE) {
				throw new ClassException("");
			}
			clsInfo.minorVersion = dis.readUnsignedShort();
			clsInfo.majorVersion = dis.readUnsignedShort();
			clsInfo.constantPoolCount = dis.readUnsignedShort();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		return null;
	}
}
