package com.gupao.factory.abstractfactory;

import com.gupao.factory.product.ICar;
import com.gupao.factory.product.ITransmission;
import com.gupao.factory.product.TyCar;
import com.gupao.factory.product.TyTransmission;

public class TyAbstractFactory implements IAbstractFactory {
	public static volatile boolean flag = true;
	
	private TyAbstractFactory(){
		synchronized (TyAbstractFactory.class) {
			if(flag == true) {
				flag = !flag;
			}else {
				throw new RuntimeException("单例模式被反射破坏");
			}
		}
	}
	
	private static final IAbstractFactory dzFactory = new TyAbstractFactory();

	public static IAbstractFactory getInstance(){
		return dzFactory;
	}
	
	public ICar createCar() {		
		return new TyCar();
	}

	public ITransmission createTransmission() {		
		return new TyTransmission();
	}

}
