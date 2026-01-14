package products;

import common.Appliance;

public class Television extends Appliance { // 티비

	@Override
	public void power() {
		onoff = !onoff;
		if (onoff)
			System.out.println("TV 전원이 켜짐");
		else
			System.out.println("TV 전원이 꺼짐");
	}

}
