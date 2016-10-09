# park-opt

Pittsburgh Parking Optimization Android App (Currently In Development)

Title for app is a work in progress. Feel free to send suggestions.

## How does this work?

### How parking in Pittsburgh works

* In the City of Pittsburgh, we no longer have parking meters.
* Instead, we use these small kiosks that are on every block.


![Kiosk Image](https://s-media-cache-ak0.pinimg.com/736x/64/5d/dd/645ddd21c1317d398723bdbdb6fbc8ef.jpg "Kiosk Image")


* When you park, you enter your licence plate and pay for some parking time at the kiosk.
* The parking attendents then can check your licence plate against the list of licence plates in the system that have paid.
* What's nice about this is that you can pay and move your car with out having to worry about getting a ticket at your new spot or overpaying at your old spot.
  Important: you can only park within about a mile of the kiosk where you paid
* Now with [Go Mobile PGH](https://play.google.com/store/apps/details?id=net.sharewire.gomobilepgh), you can pay on your phone with just the kiosk number.
* Unfortunately, **kiosks near more desireable locations cost more.**
* Theoretically, you could **pay in a cheap section and park in a more expensive section** as long as it is less than a mile away.

### How `park-opt` saves you money

* `park-opt` allows you to pay at the lowest costing kiosk, by giving you the kiosk number for the lowest costing kiosk that is within range.
* `park-opt` uses your phone's location to find the kiosk with the lowest rate less than a mile away.
* `park-opt` lets you input what time you are going to leave.
* `park-opt` pays as you park, so you can leave at anytime and not wory about having paid for the next few hours.
* `park-opt` changes which kiosk you pay at based on which is cheapest and available at the time.

### How `park-opt` lets you park for longer

* `park-opt` changes which kiosk you pay at so that you never exceed the time limits for each kiosk.

## How to Use `park-opt` 

**Using `park-opt` is quite simple**

Simply open the app and hit `Park Now`, then enter the meter number displayed into the `Go Mobile PGH` app


![UI Image](https://raw.githubusercontent.com/eppingere/park-opt/master/img/UI-Image.png)


## Why Pittsburgh?

* Pittsburgh has the parking system that allows for the creation of an app like this.
* No other city (to my knowlage) has a system like this.
* (Also I live in the Greater Pittsburgh Area, which makes it easier to test :laughing:)

