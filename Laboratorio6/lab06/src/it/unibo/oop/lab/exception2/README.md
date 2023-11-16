# `StrictBankAccountImpl`

Analyze the class `StrictBankAccountImpl`, a slighly modified version of the one you already know.

## TODOs

Modify `StrictBankAccountImpl` in such a way that:

* A `WrongAccountHolderException` is thrown if an operation is executed from an unauthorized account
* A `NotEnoughFoundsException` is thrown if there is not enough money for a draw operation to complete
* A `TransactionsOverQuotaException` is thrown if the count of ATM transactions gets over the maximum allowed

Complete the class `TestStrictBankAccount` using JUnit
