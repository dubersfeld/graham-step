# graham-step
Java based step-by-step demonstration of the Graham Scan algorithm applied to build the convex hull of a points distribution

I present here a Java based demonstration of the Graham Scan algorithm that is used to find the convex hull of a random points distribution.

Javascript is used for display and initialization only. Here are the implementation details:

A random points distribution is created (browser side)

The distribution is sent to the server as a JSON object.

Then the Graham Scan is executed step-by-step (server side).

At each step the partial result is sent to the browser as a JSON object.

The partial result is used to update the display.

When deployed on Tomcat the root context is:

graham-step

Dominique Ubersfeld, Cachan, France  

