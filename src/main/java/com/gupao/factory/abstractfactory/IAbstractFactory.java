package com.gupao.factory.abstractfactory;

import com.gupao.factory.product.ICar;
import com.gupao.factory.product.ITransmission;

public interface IAbstractFactory {
	public ICar createCar();
	
	public ITransmission createTransmission();
}
