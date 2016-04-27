# Distributed with a free-will license.
# Use it any way you want, profit or free, provided it fits in the licenses of its associated works.
# KEYFOBP2
# This code is designed to work with the KEYFOBP2 I2C Mini Module available from ControlEverything.com.
# https://www.controleverything.com/content/Key-Fob?sku=KEYFOBP2#tabs-0-product_tabset-2

import RPi.GPIO as GPIO
import time

# Set BOARD as number scheme
GPIO.setmode(GPIO.BOARD)

# Assign GPIO pins to Keyfob buttons
D0 = 5
D1 = 6
D2 = 13
D3 = 19
D4 = 26
D5 = 21
D6 = 20
D7 = 16

# Configure GPIO pins as input with pull down register enabled
GPIO.setup(D0, GPIO.IN, pull_up_down = GPIO.PUD_DOWN)
GPIO.setup(D1, GPIO.IN, pull_up_down = GPIO.PUD_DOWN)
GPIO.setup(D2, GPIO.IN, pull_up_down = GPIO.PUD_DOWN)
GPIO.setup(D3, GPIO.IN, pull_up_down = GPIO.PUD_DOWN)
GPIO.setup(D4, GPIO.IN, pull_up_down = GPIO.PUD_DOWN)
GPIO.setup(D5, GPIO.IN, pull_up_down = GPIO.PUD_DOWN)
GPIO.setup(D6, GPIO.IN, pull_up_down = GPIO.PUD_DOWN)
GPIO.setup(D7, GPIO.IN, pull_up_down = GPIO.PUD_DOWN)

# Create callback function for GPIO pin 21
def button0(channel):
	print(“Button 1 pressed!”)

# Create callback function for GPIO pin 22
def button1(channel):
	print(“Button 2 pressed!”)

# Create callback function for GPIO pin 23
def button2(channel):
	print(“Button 3 pressed!”)

# Create callback function for GPIO pin 24
def button3(channel):
	print(“Button 4 pressed!”)

# Create callback function for GPIO pin 25
def button4(channel):
	print(“Button 5 pressed!”)

# Create callback function for GPIO pin 29
def button5(channel):
	print(“Button 6 pressed!”)
	
# Create callback function for GPIO pin 28
def button6(channel):
	print(“Button 7 pressed!”)

# Create callback function for GPIO pin 27
def button7(channel):
	print(“Button 8 pressed!”)

# Create event listeners for Respective GPIO pins
# No edge detection for 300 ms, with bouncetime = 300 ms
GPIO.add_event_detect(D0, GPIO.RISING, callback = button0, bouncetime = 300)
GPIO.add_event_detect(D1, GPIO.RISING, callback = button1, bouncetime = 300)
GPIO.add_event_detect(D2, GPIO.RISING, callback = button2, bouncetime = 300)
GPIO.add_event_detect(D3, GPIO.RISING, callback = button3, bouncetime = 300)
GPIO.add_event_detect(D4, GPIO.RISING, callback = button4, bouncetime = 300)
GPIO.add_event_detect(D5, GPIO.RISING, callback = button5, bouncetime = 300)
GPIO.add_event_detect(D6, GPIO.RISING, callback = button6, bouncetime = 300)
GPIO.add_event_detect(D7, GPIO.RISING, callback = button7, bouncetime = 300)
while True :
	try :
		time.sleep(0.5)
	except KeyboardInterrupt :	
		# Clean up GPIO on CTRL+C exit
		GPIO.cleanup()
