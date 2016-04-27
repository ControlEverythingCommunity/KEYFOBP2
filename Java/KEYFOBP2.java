// Distributed with a free-will license.
// Use it any way you want, profit or free, provided it fits in the licenses of its associated works.
// KEYFOBP2
// This code is designed to work with the KEYFOBP2 I2C Mini Module available from ControlEverything.com.
// https://www.controleverything.com/content/Key-Fob?sku=KEYFOBP2#tabs-0-product_tabset-2

import java.io.IOException;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.gpio.RaspiPin;

public class KEYFOBP2
{
	public static void main(String args[]) throws InterruptedException, IOException
	{
		// Create GPIO Controller
		final GpioController gpio = GpioFactory.getInstance();
		
		// Configure GPIO Pins as Input with Pull-down register enabled
		final GpioPinDigitalInput myButtonD0 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_21, PinPullResistance.PULL_DOWN);
		final GpioPinDigitalInput myButtonD1 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_22, PinPullResistance.PULL_DOWN);
		final GpioPinDigitalInput myButtonD2 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_23, PinPullResistance.PULL_DOWN);
		final GpioPinDigitalInput myButtonD3 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_24, PinPullResistance.PULL_DOWN);
		final GpioPinDigitalInput myButtonD4 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_25, PinPullResistance.PULL_DOWN);
		final GpioPinDigitalInput myButtonD5 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_29, PinPullResistance.PULL_DOWN);
		final GpioPinDigitalInput myButtonD6 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_28, PinPullResistance.PULL_DOWN);
		final GpioPinDigitalInput myButtonD7 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_27, PinPullResistance.PULL_DOWN);
		
		// Ceate and register GPIO Pin listener
		myButtonD0.addListener(new GpioPinListenerDigital()
		{
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event)
			{
				// Display Pin state on screen
				System.out.println(" --> GPIO PIN STATE CHANGE: " + event.getPin() + " = " + event.getState());
			}
		});
		
		myButtonD1.addListener(new GpioPinListenerDigital()
		{
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event)
			{
				// Display Pin state on screen
				System.out.println(" --> GPIO PIN STATE CHANGE: " + event.getPin() + " = " + event.getState());
			}
		});
		
		myButtonD2.addListener(new GpioPinListenerDigital()
		{
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				// Display Pin state on screen
				System.out.println(" --> GPIO PIN STATE CHANGE: " + event.getPin() + " = " + event.getState());
			}
		});
		
		myButtonD3.addListener(new GpioPinListenerDigital()
		{
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event)
			{
				// Display Pin state on screen
				System.out.println(" --> GPIO PIN STATE CHANGE: " + event.getPin() + " = " + event.getState());
			}
		});
		
		myButtonD4.addListener(new GpioPinListenerDigital()
		{
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event)
			{
				// Display Pin state on screen
				System.out.println(" --> GPIO PIN STATE CHANGE: " + event.getPin() + " = " + event.getState());
			}
		});
		
		myButtonD5.addListener(new GpioPinListenerDigital()
		{
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event)
			{
				// Display Pin state on screen
				System.out.println(" --> GPIO PIN STATE CHANGE: " + event.getPin() + " = " + event.getState());
			}
		});
		
		myButtonD6.addListener(new GpioPinListenerDigital()
		{
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event)
			{
				// Display Pin state on screen
				System.out.println(" --> GPIO PIN STATE CHANGE: " + event.getPin() + " = " + event.getState());
			}
		});
		
		myButtonD7.addListener(new GpioPinListenerDigital()
		{
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event)
			{
				// Display Pin state on screen
				System.out.println(" --> GPIO PIN STATE CHANGE: " + event.getPin() + " = " + event.getState());
			}
		});
		
		// Keep program running until user aborts (CTRL-C)
		for (;;)
		{
			Thread.sleep(500);
		}
	}
}