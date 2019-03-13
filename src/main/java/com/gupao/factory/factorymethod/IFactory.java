package com.gupao.factory.factorymethod;

import com.gupao.factory.product.ICar;

/**
 * 工厂方法模式的工厂接口
 * @author ljz
 *
 */
public interface IFactory {
	public ICar create() throws Exception;
}
