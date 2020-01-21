package com.clilystudio.zuzi.info;

import com.clilystudio.zuzi.core.ConstPoolTag;

public abstract class AbstractConstPoolInfo<E> {
	private byte tag;
	
	private byte[] data;
	
	public AbstractConstPoolInfo() {
		
	}
	
	public void setData(byte tag, byte[] data) {
		this.data = data; 
	}
	
	public E getValue() {
		E value = null;
		switch (this.tag) {
		case ConstPoolTag.TAG_CLASS:
			break;
		}
		return value;
	}
}
