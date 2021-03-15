package com.stratergy.desing.pattern;

import com.stratergy.desing.pattern.duck.Duck;
import com.stratergy.desing.pattern.duck.ModelDuck;
import com.stratergy.desing.pattern.fly.FlyNoWay;
import com.stratergy.desing.pattern.quack.Squeak;

public class DuckSimulator {

	public static void main(String[] args) {
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.performQuack();

		System.out.println("===========================");

		modelDuck.setFlyBehaviour(new FlyNoWay());
		modelDuck.setQuackBehaviour(new Squeak());
		modelDuck.performFly();
		modelDuck.performQuack();
	}

}
