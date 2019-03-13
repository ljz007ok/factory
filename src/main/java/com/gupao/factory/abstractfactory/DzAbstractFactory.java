package com.gupao.factory.abstractfactory;

import com.gupao.factory.product.DzCar;
import com.gupao.factory.product.DzTransmission;
import com.gupao.factory.product.ICar;
import com.gupao.factory.product.ITransmission;

public class DzAbstractFactory implements IAbstractFactory {
	public static volatile boolean flag = true;
	
	private DzAbstractFactory(){
		synchronized (DzAbstractFactory.class) {
			if(flag == true) {
				flag = !flag;
			}else {
				throw new RuntimeException("单例模式被反射破坏");
			}
		}
	}
	
	private static final IAbstractFactory dzFactory = new DzAbstractFactory();

	public static IAbstractFactory getInstance(){
		return dzFactory;
	}
	
	public ICar createCar() {		
		return new DzCar();
	}

	public ITransmission createTransmission() {		
		return new DzTransmission();
	}

}
