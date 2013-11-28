gradle-console
============
gradle-console allows you to easily interact with your Groovy and Java applications.
Just run <code>gradle console</code> and you will get a console window with all your runtime dependencies loaded for you.
This is useful in case you need to interact your project dependencies or your source code in a fast and flexible way.


## Instalation
Just add the following snippet of code to your <code>build.gradle</code> file

```groovy
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath group: 'carlosgsouza', name: 'gradle-console', version: '1.0'
    }
}
```

## Usage
Invoke the <code>console</code> task using gradle

```
gradle console
```

## About this project
This is just the first version of this plugin and we are couting on your feedback to make it better! 
Don't hesitate to send us an e-mail, create an issue on GitHub or, even better, submit a pull request. 
