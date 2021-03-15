package com.stratergy.desing.pattern.duck;

import com.stratergy.desing.pattern.fly.FlyBehaviour;
import com.stratergy.desing.pattern.quack.QuackBehaviour;

public abstract class Duck {

	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;

	public abstract void display();

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}


}
