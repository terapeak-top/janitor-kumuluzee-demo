# Janitor KumuluzEE demo

This is a demo application that demonstrates the usage of the [Janitor library](https://github.com/terapeak-top/janitor) in a
[KumuluzEE/](https://ee.kumuluz.com/) project environment.

## What the demo does
It starts a sample application that creates dummy Order entities and stores them into a repository, just to be later cleaned up by the [Janitor cleaner](https://github.com/terapeak-top/janitor/blob/main/janitor-core/src/main/java/top/terapeak/janitor/executor/CleanupExecutor.java).

## Classes to check
The main focus is on the Customer class and the [@Cleanup](https://github.com/terapeak-top/janitor/blob/main/janitor-core/src/main/java/top/terapeak/janitor/annotation/Cleanup.java) annotation

## How to run the demo:
```bash
mvn kumuluzee:run
```