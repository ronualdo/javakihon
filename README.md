# Java Kihon

This project is a example of a basic spring boot + spring mvc + hibernate application.

## Running tests

You can run tests by executing `make test`

## How to run

To run the server, from the root folder, just use the command `make run`.

If the app is running properly, you should be able to access `http://localhost:8080`.

`http://localhost:8080/greeting/1` should lead you to a hello world page for the person with id 1.

### Dependency

Note that the app needs to connect to a [postgres](https://www.postgresql.org/) server running in order to run.

If no `DB_HOST` environment variable is set, the app will look for the server at `localhost`.
