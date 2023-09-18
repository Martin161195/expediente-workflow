## Build the project

Either open the project in IntelliJ, which will automatically build it, or in the project's root directory run:

```
./gradlew build
```

## Run the Workflow

First, make sure the [Temporal server](https://docs.temporal.io/docs/server/quick-install) is running.

To start the Workflow, either run the InitiateMoneyTransfer class from IntelliJ or from the project root run:

```
./gradlew initRecordProcess
```

To start the Worker, either run the MoneyTransferWorker class from IntelliJ or from the project root run:

```
./gradlew startWorker --console=plain
```
