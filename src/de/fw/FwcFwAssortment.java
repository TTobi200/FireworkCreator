/*
 * $Header$
 *
 * $Log$
 * Copyright © 2014 Unitechnik AG. All Rights Reserved.
 */
package de.fw;

public class FwcFwAssortment extends FwcFwBattery
{
	private static final long serialVersionUID = 1L;
	private FwcFwBattery[] battery;

	public FwcFwAssortment(String name, String bamNr, String producer,
							String dim, String desc, int nem, int dangerClass,
							double weight, double price, int effectHeight,
							double caliber, double burnLen, FwcFwBattery... battery)
	{
		super(name, bamNr, producer, dim, desc, nem, dangerClass, weight, price,
			effectHeight, caliber, burnLen);
		this.setBattery(battery);
	}

	public FwcFwBattery[] getBattery()
	{
		return battery;
	}

	public void setBattery(FwcFwBattery[] battery)
	{
		this.battery = battery;
	}
}