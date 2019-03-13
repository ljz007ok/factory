package com.gupao.factory.abstractfactory;

import com.gupao.factory.product.FtCar;
import com.gupao.factory.product.FtTransmission;
import com.gupao.factory.product.ICar;
import com.gupao.factory.product.ITransmission;

public class FtAbstractFactory implements IAbstractFactory {
	public static volatile boolean flag = true;
	
	private FtAbstractFactory(){
		synchronized (FtAbstractFactory.class) {
			if(flag == true) {
				flag = !flag;
			}else {
				throw new RuntimeException("单例模式被反射破坏");
			}
		}
	}
	
	private static final IAbstractFactory ftFactory = new FtAbstractFactory();

	public static IAbstractFactory getInstance(){
		return ftFactory;
	}
	
	public ICar createCar() {		
		return new FtCar();
	}

	public ITransmission createTransmission() {		
		return new FtTransmission();
	}

}
