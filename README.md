# Test Scalatra #

## Build & Run ##

```sh
$ cd Test_Scalatra
$ ./sbt
> container:start
> browse
```

If `browse` doesn't launch your browser, manually open [http://localhost:8080/](http://localhost:8080/) in your browser.

Then enter
```
> ~ ;copy-resources;aux-compile
```

Now SBT will monitor code changes and restart the application automatically.

To create Eclipse project files, enter:
```
> eclipse
```
This will generate the .project and .classpath files. Now you can import the project as existing project 
into your Eclipse workspace. 