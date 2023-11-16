# Instructions

Foreword: this exercise is created to get you acquainted with exceptions. Please, keep in mind that, even though in this exercise we do so, using exceptions for flow control is **bad**, both in performance and in code understandability (an exception is a de-facto goto handler).

## `BaseRobotTest`
Read the class very carefully.
It leverages JUnit as test suite.
See how assertions can be used to verify properties about the system, and in particular:

* `assertTrue` and `assertFalse` verify that a boolean conditions holds (or does not)
* `assertEquals` verifies that some object equals the expected value (that must be passed as first argument)
* `assertNotNull` verifies that some object is not null
* `fail` makes the test fail early in case some unexpected event happened (e.g. an exception was expected but was not thrown)

Execute the test within Eclipse.

## Use existing exceptions

### `RobotEnvironment.move()`

Modify the `move` method in RobotEnvironment in such a way that a `PositionOutOfBoundsException` (already provided) is thrown in case the robot gets outside the environment limits

#### Guideline

* Make the method return `void`

### `Robot`

Modify `Robot` to make it work with `RobotEnvironment`

#### Guideline

* `moveToPosition` must not deal with the exception directly. In fact, we don't expect `Robot` to deal with the exception at all, but those who use it!
* `moveToPosition` must be changed to account for the changes in `RobotEnvironment.move()`
* `moveUp`, `moveDown`, `moveLeft`, and `moveRight` need a refactoring as well

### `BaseRobotTest`

* Modify `BaseRobotTest.testRobotMovementBase` in order to verify that the exceptions are correctly thrown
* **HINT**: Use `Assert.fail()` in the try block, and `Assert.assertNotNull()` to verify that the exception message is present

## Design a new exception

Design and realize `NotEnoughBatteryException`, to be thrown when the robot is asked to move (whatever the direction) in case the battery is not sufficient

### Guideline

* Extend one among: `Exception`, `RuntimeException`, or `IllegalStateException`. Prepare yourself to explain the professor the reason behind your choice.
* Change the behavior of `moveToPosition` (it must return `void`)
* Throw an exception if there is not enough battery)
* Refactor `moveUp` and `moveDown`
* Modify `BaseRobotTest.testRobotBatteryBase()` to verify that the exception is correctly implemented and thrown
