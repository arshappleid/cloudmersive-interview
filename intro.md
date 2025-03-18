## Requirements
Have Docker Engine running , the command below will handle all the packaging , building and Spinning up the server, and installing all the dependencies.

Spin up the Server using ```docker-compose --profile prod up```
## how to run 

I will build a post API , that calculates the moving average of an array.

How to query the API using Postman:
Query Using a post request ```http://localhost:8080/math/movingAverage```
Using the following Body Parameters
```
{
	"data" : [1,2,3,4,5],
	"windowSize" : 3
}
```
## Testing Logic
You can test all the test cases, but in case of division by zero or if the window Size is bigger than array size it will simply return invalid input.

## Location of Tests
src/test/java/com/cloudmersive/service/mathTest.java

## MISC
To get a summary of which files are where read the ```README.MD``` file.